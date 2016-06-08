package com.wh40k.unitviewer.Controllers;

import com.wh40k.unitviewer.Entities.Model;
import com.wh40k.unitviewer.Repositories.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;

/**
 * Created by Ultramar on 6/7/16.
 */
@Controller
public class UnitViewerController {

    @Autowired
    ModelRepository model;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home() {
        return "home";
    }





    @PostConstruct
    public void init() {
        Model yarrick = new Model("Commissar Yarrick", 5, 5, 4, 10, "ImperialGuard", "https://www.games-workshop.com/resources/catalog/product/600x620/99800105003_LordCommissarNEW01.jpg");
        model.save(yarrick);
        Model commander = new Model("Companny Commander", 4, 4, 3, 9, "ImperialGuard", "https://s-media-cache-ak0.pinimg.com/736x/e9/59/af/e959af0e1d707a6d0ba07a4247c2a469.jpg");
        model.save(commander);
        Model creed = new Model("Lord Castellian Creed", 4, 4, 3, 10, "ImperialGuard", "http://store.miniwargaming.com/images/D/lord-castellan-creed.jpg");
        model.save(creed);
        Model kell = new Model("Colour Sergent Kell", 4, 4, 3, 8, "ImperialGuard", "https://www.games-workshop.com/resources/catalog/product/600x620/99800105006_SergeantKellNEW01.jpg");
        model.save(kell);
        Model straken = new Model("Colonel Straken", 4, 5, 4, 9, "ImperialGuard", "https://www.games-workshop.com/resources/catalog/product/600x620/99060105264_StrakenNEW01.jpg");
        model.save(straken);
        Model deddog = new Model("Nork Deddog", 3, 4, 5, 8, "ImperialGuard", "https://www.games-workshop.com/resources/catalog/product/600x620/99120105053_NorkDeddog360.jpg");
        model.save(deddog);
        Model lCommissar = new Model("Lord Commissar", 5, 5, 3, 10, "ImperialGuard", "https://www.games-workshop.com/resources/catalog/product/600x620/99800105003_LordCommissarNEW01.jpg");
        model.save(lCommissar);
        Model imotekh = new Model("Imotekh the Stormlord", 4, 4, 5, 10, "Necrons", "http://vignette2.wikia.nocookie.net/warhammer40k/images/0/06/Imotehk_the_Stormlord.jpg/revision/latest?cb=20130723074931");
        model.save(imotekh);
        Model nemesor = new Model("Nemesor Zahndrekh", 4, 4, 5, 10, "Necrons", "http://vignette2.wikia.nocookie.net/warhammer40k/images/d/d6/Nemesor_Zandrekh.jpg/revision/latest?cb=20130729021704");
        model.save(nemesor);
        Model vargard = new Model("Vargard Obyron", 4, 6, 5, 10, "Necrons", "http://vignette2.wikia.nocookie.net/warhammer40k/images/8/82/Varguard_Obyron.jpg/revision/latest?cb=20130729024801");
        model.save(vargard);
        Model szeras = new Model("Illuminor Szeras", 4, 4, 4, 10, "Necrons", "https://www.games-workshop.com/resources/catalog/product/600x620/99800110012_IlluminarSzerasNEW01.jpg");
        model.save(szeras);
        Model orikan = new Model("Orikan the Diviner", 4, 4, 4, 10, "Necrons", "https://www.games-workshop.com/resources/catalog/product/600x620/99800110016_OrikanTheDivinerNEW01.jpg");
        model.save(orikan);
        Model anrakyr = new Model("Anrakyr the Traveller", 4, 4, 5, 10, "Necrons", "https://www.games-workshop.com/resources/catalog/product/600x620/99800110017_AnrakyrNEW01.jpg");
        model.save(anrakyr);
        Model trazyn = new Model("Trazyn the Infinite", 4, 4, 5, 10, "Necrons", "http://vignette2.wikia.nocookie.net/warhammer40k/images/7/7c/Trazyn_the_Infinite.jpg/revision/latest?cb=20130725090217");
        model.save(trazyn);
        Model overlord = new Model("Necron Overlord", 4, 4, 5, 10, "Necrons", "https://www.games-workshop.com/resources/catalog/product/600x620/99070110001_NecronOverlord01.jpg");
        model.save(overlord);
        Model destroyer = new Model("Destroyer Lord", 4, 4, 6, 10, "Necrone", "https://www.games-workshop.com/resources/catalog/product/600x620/99800110014_DestroyerLordPackNEW01.jpg");
        model.save(destroyer);
        Model calgar = new Model("Marneus Calgar, Lord Macragge", 5, 6, 4, 10, "SpaceMarines", "https://www.games-workshop.com/resources/catalog/product/600x620/99810101013_MarneusCalgar360.jpg");
        model.save(calgar);
        Model cato = new Model("Cato Sicarius", 5, 6, 4, 10, "SpaceMarines", "https://www.games-workshop.com/resources/catalog/product/600x620/99800101010_CaptainSicariusNEW01.jpg");
        model.save(cato);
        Model tigurius = new Model("Chief Librarian Tigurius", 4, 5, 4, 10, "SpaceMarines", "http://www.spikeybits.com/wp-content/uploads/2016/04/Tigurius.jpg");
        model.save(tigurius);
        Model cassius = new Model("Chaplain Cassius", 4, 5, 6, 10, "SpaceMarines", "https://www.games-workshop.com/resources/catalog/product/600x620/99800101041_ChaplainCassiusNEW01.jpg");
        model.save(cassius);
        Model pedro = new Model("Chapter Master Padro Kantor", 5, 6, 4, 10, "SpaceMarines", "https://www.games-workshop.com/resources/catalog/product/600x620/99800101059_PedroKantor360.jpg");
        model.save(pedro);
        Model darnath = new Model("Captian Darnath Lysander", 5, 6, 4, 10, "SpaceMarines", "https://www.games-workshop.com/resources/catalog/product/600x620/99800101059_CaptainLysanderNEW01.jpg");
        model.save(darnath);
        Model kayvaan = new Model("Shadow Captain Kayvaan Shrike", 5, 6, 4, 10, "SpaceMarines", "https://www.games-workshop.com/resources/catalog/product/600x620/99800101060_ShadowCaptainShrike360.jpg");
        model.save(kayvaan);
        Model vulkan = new Model("Forgefather Vulkan He'stan", 5, 6, 4, 10, "SpaceMarines", "https://www.games-workshop.com/resources/catalog/product/600x620/99800101058_VulkanHestan360.jpg");
        model.save(vulkan);
        Model khan = new Model("Kor'sarro Khan", 5, 6, 4, 10, "SpaceMarines", "https://www.games-workshop.com/resources/catalog/product/600x620/99800101062_KorsarroKhanNEW01.jpg");
        model.save(khan);


    }
}
