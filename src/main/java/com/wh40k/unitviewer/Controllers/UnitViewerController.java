package com.wh40k.unitviewer.Controllers;

import com.wh40k.unitviewer.Entities.Unit;
import com.wh40k.unitviewer.Repositories.UnitRepository;
import com.wh40k.unitviewer.Utilities.SelectOption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


@Controller
public class UnitViewerController {

    @Autowired
    UnitRepository unitRepo;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(Model model, String army, Integer id) {
        model.addAttribute("armies", unitRepo.findDistinctArmy()
                .stream()
                .map(a -> new SelectOption(a, a, Objects.equals(a, army)))
                .collect(Collectors.toList()));


        if (army != null) {
            model.addAttribute("armyOptions", unitRepo.findByArmy(army)
                    .stream()
                    .map(u -> new SelectOption(String.valueOf(u.getId()), u.getName(), Objects.equals(u.getId(), id)))
                    .collect(Collectors.toList()));
        }

        if (id != null) {
            model.addAttribute("unit", unitRepo.findById(id));
        }
        return "index";
    }

    @PostConstruct
    public void init() {
        unitRepo.deleteAll();
        Unit yarrick = new Unit("Commissar Yarrick", 5, 5, 4, 10, "ImperialGuard", "https://www.games-workshop.com/resources/catalog/product/600x620/99800105003_LordCommissarNEW01.jpg");
        unitRepo.save(yarrick);
        Unit commander = new Unit("Company Commander", 4, 4, 3, 9, "ImperialGuard", "https://s-media-cache-ak0.pinimg.com/736x/e9/59/af/e959af0e1d707a6d0ba07a4247c2a469.jpg");
        unitRepo.save(commander);
        Unit creed = new Unit("Lord Castellian Creed", 4, 4, 3, 10, "ImperialGuard", "http://store.miniwargaming.com/images/D/lord-castellan-creed.jpg");
        unitRepo.save(creed);
        Unit kell = new Unit("Colour Sergent Kell", 4, 4, 3, 8, "ImperialGuard", "https://www.games-workshop.com/resources/catalog/product/600x620/99800105006_SergeantKellNEW01.jpg");
        unitRepo.save(kell);
        Unit straken = new Unit("Colonel Straken", 4, 5, 4, 9, "ImperialGuard", "https://www.games-workshop.com/resources/catalog/product/600x620/99060105264_StrakenNEW01.jpg");
        unitRepo.save(straken);
        Unit deddog = new Unit("Nork Deddog", 3, 4, 5, 8, "ImperialGuard", "https://www.games-workshop.com/resources/catalog/product/600x620/99120105053_NorkDeddog360.jpg");
        unitRepo.save(deddog);
        Unit lCommissar = new Unit("Lord Commissar", 5, 5, 3, 10, "ImperialGuard", "https://www.games-workshop.com/resources/catalog/product/600x620/99800105003_LordCommissarNEW01.jpg");
        unitRepo.save(lCommissar);
        Unit imotekh = new Unit("Imotekh the Stormlord", 4, 4, 5, 10, "Necrons", "https://www.games-workshop.com/resources/catalog/product/600x620/99800110006_ImotekhTheStormlordNEW01.jpg");
        unitRepo.save(imotekh);
        Unit nemesor = new Unit("Nemesor Zahndrekh", 4, 4, 5, 10, "Necrons", "http://vignette2.wikia.nocookie.net/warhammer40k/images/d/d6/Nemesor_Zandrekh.jpg/revision/latest?cb=20130729021704");
        unitRepo.save(nemesor);
        Unit vargard = new Unit("Vargard Obyron", 4, 6, 5, 10, "Necrons", "http://vignette2.wikia.nocookie.net/warhammer40k/images/8/82/Varguard_Obyron.jpg/revision/latest?cb=20130729024801");
        unitRepo.save(vargard);
        Unit szeras = new Unit("Illuminor Szeras", 4, 4, 4, 10, "Necrons", "https://www.games-workshop.com/resources/catalog/product/600x620/99800110012_IlluminarSzerasNEW01.jpg");
        unitRepo.save(szeras);
        Unit orikan = new Unit("Orikan the Diviner", 4, 4, 4, 10, "Necrons", "https://www.games-workshop.com/resources/catalog/product/600x620/99800110016_OrikanTheDivinerNEW01.jpg");
        unitRepo.save(orikan);
        Unit anrakyr = new Unit("Anrakyr the Traveller", 4, 4, 5, 10, "Necrons", "https://www.games-workshop.com/resources/catalog/product/600x620/99800110017_AnrakyrNEW01.jpg");
        unitRepo.save(anrakyr);
        Unit trazyn = new Unit("Trazyn the Infinite", 4, 4, 5, 10, "Necrons", "http://vignette2.wikia.nocookie.net/warhammer40k/images/7/7c/Trazyn_the_Infinite.jpg/revision/latest?cb=20130725090217");
        unitRepo.save(trazyn);
        Unit overlord = new Unit("Necron Overlord", 4, 4, 5, 10, "Necrons", "https://www.games-workshop.com/resources/catalog/product/600x620/99070110001_NecronOverlord01.jpg");
        unitRepo.save(overlord);
        Unit destroyer = new Unit("Destroyer Lord", 4, 4, 6, 10, "Necrons", "https://www.games-workshop.com/resources/catalog/product/600x620/99800110014_DestroyerLordPackNEW01.jpg");
        unitRepo.save(destroyer);
        Unit calgar = new Unit("Marneus Calgar, Lord Macragge", 5, 6, 4, 10, "SpaceMarines", "https://www.games-workshop.com/resources/catalog/product/600x620/99810101013_MarneusCalgar360.jpg");
        unitRepo.save(calgar);
        Unit cato = new Unit("Cato Sicarius", 5, 6, 4, 10, "SpaceMarines", "https://www.games-workshop.com/resources/catalog/product/600x620/99800101010_CaptainSicariusNEW01.jpg");
        unitRepo.save(cato);
        Unit tigurius = new Unit("Chief Librarian Tigurius", 4, 5, 4, 10, "SpaceMarines", "http://www.spikeybits.com/wp-content/uploads/2016/04/Tigurius.jpg");
        unitRepo.save(tigurius);
        Unit cassius = new Unit("Chaplain Cassius", 4, 5, 6, 10, "SpaceMarines", "https://www.games-workshop.com/resources/catalog/product/600x620/99800101041_ChaplainCassiusNEW01.jpg");
        unitRepo.save(cassius);
        Unit pedro = new Unit("Chapter Master Padro Kantor", 5, 6, 4, 10, "SpaceMarines", "https://www.games-workshop.com/resources/catalog/product/600x620/99800101059_PedroKantor360.jpg");
        unitRepo.save(pedro);
        Unit darnath = new Unit("Captain Darnath Lysander", 5, 6, 4, 10, "SpaceMarines", "https://www.games-workshop.com/resources/catalog/product/600x620/99800101059_CaptainLysanderNEW01.jpg");
        unitRepo.save(darnath);
        Unit kayvaan = new Unit("Shadow Captain Kayvaan Shrike", 5, 6, 4, 10, "SpaceMarines", "https://www.games-workshop.com/resources/catalog/product/600x620/99800101060_ShadowCaptainShrike360.jpg");
        unitRepo.save(kayvaan);
        Unit vulkan = new Unit("Forgefather Vulkan He'stan", 5, 6, 4, 10, "SpaceMarines", "https://www.games-workshop.com/resources/catalog/product/600x620/99800101058_VulkanHestan360.jpg");
        unitRepo.save(vulkan);
        Unit khan = new Unit("Kor'sarro Khan", 5, 6, 4, 10, "SpaceMarines", "https://www.games-workshop.com/resources/catalog/product/600x620/99800101062_KorsarroKhanNEW01.jpg");
        unitRepo.save(khan);


    }
}
