package com.wh40k.unitviewer.Controllers;

import com.wh40k.unitviewer.Entities.Units;
import com.wh40k.unitviewer.Repositories.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Ultramar on 6/7/16.
 */
@Controller
public class UnitViewerController {

    @Autowired
    UnitRepository unit;



    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(Model model) {

        return "home";
    }

    @RequestMapping(path = "find-army", method = RequestMethod.POST)
    public String findArmy(String army){
        List<Units> armyOptions = unit.findByArmy(army);

        return "redirect:/";
    }





    @PostConstruct
    public void init() {
        Units yarrick = new Units("Commissar Yarrick", 5, 5, 4, 10, "ImperialGuard", "https://www.games-workshop.com/resources/catalog/product/600x620/99800105003_LordCommissarNEW01.jpg");
        unit.save(yarrick);
        Units commander = new Units("Companny Commander", 4, 4, 3, 9, "ImperialGuard", "https://s-media-cache-ak0.pinimg.com/736x/e9/59/af/e959af0e1d707a6d0ba07a4247c2a469.jpg");
        unit.save(commander);
        Units creed = new Units("Lord Castellian Creed", 4, 4, 3, 10, "ImperialGuard", "http://store.miniwargaming.com/images/D/lord-castellan-creed.jpg");
        unit.save(creed);
        Units kell = new Units("Colour Sergent Kell", 4, 4, 3, 8, "ImperialGuard", "https://www.games-workshop.com/resources/catalog/product/600x620/99800105006_SergeantKellNEW01.jpg");
        unit.save(kell);
        Units straken = new Units("Colonel Straken", 4, 5, 4, 9, "ImperialGuard", "https://www.games-workshop.com/resources/catalog/product/600x620/99060105264_StrakenNEW01.jpg");
        unit.save(straken);
        Units deddog = new Units("Nork Deddog", 3, 4, 5, 8, "ImperialGuard", "https://www.games-workshop.com/resources/catalog/product/600x620/99120105053_NorkDeddog360.jpg");
        unit.save(deddog);
        Units lCommissar = new Units("Lord Commissar", 5, 5, 3, 10, "ImperialGuard", "https://www.games-workshop.com/resources/catalog/product/600x620/99800105003_LordCommissarNEW01.jpg");
        unit.save(lCommissar);
        Units imotekh = new Units("Imotekh the Stormlord", 4, 4, 5, 10, "Necrons", "http://vignette2.wikia.nocookie.net/warhammer40k/images/0/06/Imotehk_the_Stormlord.jpg/revision/latest?cb=20130723074931");
        unit.save(imotekh);
        Units nemesor = new Units("Nemesor Zahndrekh", 4, 4, 5, 10, "Necrons", "http://vignette2.wikia.nocookie.net/warhammer40k/images/d/d6/Nemesor_Zandrekh.jpg/revision/latest?cb=20130729021704");
        unit.save(nemesor);
        Units vargard = new Units("Vargard Obyron", 4, 6, 5, 10, "Necrons", "http://vignette2.wikia.nocookie.net/warhammer40k/images/8/82/Varguard_Obyron.jpg/revision/latest?cb=20130729024801");
        unit.save(vargard);
        Units szeras = new Units("Illuminor Szeras", 4, 4, 4, 10, "Necrons", "https://www.games-workshop.com/resources/catalog/product/600x620/99800110012_IlluminarSzerasNEW01.jpg");
        unit.save(szeras);
        Units orikan = new Units("Orikan the Diviner", 4, 4, 4, 10, "Necrons", "https://www.games-workshop.com/resources/catalog/product/600x620/99800110016_OrikanTheDivinerNEW01.jpg");
        unit.save(orikan);
        Units anrakyr = new Units("Anrakyr the Traveller", 4, 4, 5, 10, "Necrons", "https://www.games-workshop.com/resources/catalog/product/600x620/99800110017_AnrakyrNEW01.jpg");
        unit.save(anrakyr);
        Units trazyn = new Units("Trazyn the Infinite", 4, 4, 5, 10, "Necrons", "http://vignette2.wikia.nocookie.net/warhammer40k/images/7/7c/Trazyn_the_Infinite.jpg/revision/latest?cb=20130725090217");
        unit.save(trazyn);
        Units overlord = new Units("Necron Overlord", 4, 4, 5, 10, "Necrons", "https://www.games-workshop.com/resources/catalog/product/600x620/99070110001_NecronOverlord01.jpg");
        unit.save(overlord);
        Units destroyer = new Units("Destroyer Lord", 4, 4, 6, 10, "Necrone", "https://www.games-workshop.com/resources/catalog/product/600x620/99800110014_DestroyerLordPackNEW01.jpg");
        unit.save(destroyer);
        Units calgar = new Units("Marneus Calgar, Lord Macragge", 5, 6, 4, 10, "SpaceMarines", "https://www.games-workshop.com/resources/catalog/product/600x620/99810101013_MarneusCalgar360.jpg");
        unit.save(calgar);
        Units cato = new Units("Cato Sicarius", 5, 6, 4, 10, "SpaceMarines", "https://www.games-workshop.com/resources/catalog/product/600x620/99800101010_CaptainSicariusNEW01.jpg");
        unit.save(cato);
        Units tigurius = new Units("Chief Librarian Tigurius", 4, 5, 4, 10, "SpaceMarines", "http://www.spikeybits.com/wp-content/uploads/2016/04/Tigurius.jpg");
        unit.save(tigurius);
        Units cassius = new Units("Chaplain Cassius", 4, 5, 6, 10, "SpaceMarines", "https://www.games-workshop.com/resources/catalog/product/600x620/99800101041_ChaplainCassiusNEW01.jpg");
        unit.save(cassius);
        Units pedro = new Units("Chapter Master Padro Kantor", 5, 6, 4, 10, "SpaceMarines", "https://www.games-workshop.com/resources/catalog/product/600x620/99800101059_PedroKantor360.jpg");
        unit.save(pedro);
        Units darnath = new Units("Captian Darnath Lysander", 5, 6, 4, 10, "SpaceMarines", "https://www.games-workshop.com/resources/catalog/product/600x620/99800101059_CaptainLysanderNEW01.jpg");
        unit.save(darnath);
        Units kayvaan = new Units("Shadow Captain Kayvaan Shrike", 5, 6, 4, 10, "SpaceMarines", "https://www.games-workshop.com/resources/catalog/product/600x620/99800101060_ShadowCaptainShrike360.jpg");
        unit.save(kayvaan);
        Units vulkan = new Units("Forgefather Vulkan He'stan", 5, 6, 4, 10, "SpaceMarines", "https://www.games-workshop.com/resources/catalog/product/600x620/99800101058_VulkanHestan360.jpg");
        unit.save(vulkan);
        Units khan = new Units("Kor'sarro Khan", 5, 6, 4, 10, "SpaceMarines", "https://www.games-workshop.com/resources/catalog/product/600x620/99800101062_KorsarroKhanNEW01.jpg");
        unit.save(khan);


    }
}
