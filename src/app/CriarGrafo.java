package app;


public class CriarGrafo {
    public CriarGrafo(Grafo g) {

        Vertice AC = new Vertice("AC");
        Vertice AL = new Vertice("AL");
        Vertice AM = new Vertice("AM");
        Vertice AP = new Vertice("AP");
        Vertice BA = new Vertice("BA");
        Vertice CE = new Vertice("CE");
        Vertice DF = new Vertice("DF");
        Vertice ES = new Vertice("ES");
        Vertice GO = new Vertice("GO");
        Vertice MA = new Vertice("MA");
        Vertice MG = new Vertice("MG");
        Vertice MS = new Vertice("MS");
        Vertice MT = new Vertice("MT");
        Vertice PA = new Vertice("PA");
        Vertice PB = new Vertice("PB");
        Vertice PE = new Vertice("PE");
        Vertice PI = new Vertice("PI");
        Vertice PR = new Vertice("PR");
        Vertice RJ = new Vertice("RJ");
        Vertice RN = new Vertice("RN");
        Vertice RO = new Vertice("RO");
        Vertice RR = new Vertice("RR");
        Vertice RS = new Vertice("RS");
        Vertice SC = new Vertice("SC");
        Vertice SE = new Vertice("SE");
        Vertice SP = new Vertice("SP");
        Vertice TO = new Vertice("TO");


        g.adicionarVertice(AC);
        g.adicionarVertice(AL);
        g.adicionarVertice(AM);
        g.adicionarVertice(AP);
        g.adicionarVertice(BA);
        g.adicionarVertice(CE);
        g.adicionarVertice(DF);
        g.adicionarVertice(ES);
        g.adicionarVertice(GO);
        g.adicionarVertice(MA);
        g.adicionarVertice(MG);
        g.adicionarVertice(MS);
        g.adicionarVertice(MT);
        g.adicionarVertice(PA);
        g.adicionarVertice(PB);
        g.adicionarVertice(PE);
        g.adicionarVertice(PI);
        g.adicionarVertice(PR);
        g.adicionarVertice(RJ);
        g.adicionarVertice(RN);
        g.adicionarVertice(RO);
        g.adicionarVertice(RR);
        g.adicionarVertice(RS);
        g.adicionarVertice(SC);
        g.adicionarVertice(SE);
        g.adicionarVertice(SP);
        g.adicionarVertice(TO);


        g.adicionarAresta(new Aresta("a1", AC, AM, 1300));
        g.adicionarAresta(new Aresta("a2", AC, RO, 260));
        g.adicionarAresta(new Aresta("a3", AL, BA, 270));
        g.adicionarAresta(new Aresta("a4", AL, PE, 400));
        g.adicionarAresta(new Aresta("a5", AL, SE, 500));
        g.adicionarAresta(new Aresta("a6", AP, PA, 800));
        g.adicionarAresta(new Aresta("a7", AM, MT, 600));
        g.adicionarAresta(new Aresta("a8", AM, PA, 280));
        g.adicionarAresta(new Aresta("a9", AM, RO, 800));
        g.adicionarAresta(new Aresta("a10", AM, RR, 1000));
        g.adicionarAresta(new Aresta("a11", BA, ES, 1400));
        g.adicionarAresta(new Aresta("a12", BA, PE, 1200));
        g.adicionarAresta(new Aresta("a13", BA, PI, 600));
        g.adicionarAresta(new Aresta("a14", BA, TO, 800));
        g.adicionarAresta(new Aresta("a15", BA, GO, 520));
        g.adicionarAresta(new Aresta("a16", BA, MG, 1400));
        g.adicionarAresta(new Aresta("a17", BA, SE, 490));
        g.adicionarAresta(new Aresta("a18", CE, PB, 1500));
        g.adicionarAresta(new Aresta("a19", CE, PE, 930));
        g.adicionarAresta(new Aresta("a20", CE, PI, 720));
        g.adicionarAresta(new Aresta("a21", CE, RN, 880));
        g.adicionarAresta(new Aresta("a22", DF, GO, 210));
        g.adicionarAresta(new Aresta("a23", DF, MG, 850));
        g.adicionarAresta(new Aresta("a24", ES, MG, 640));
        g.adicionarAresta(new Aresta("a25", ES, RJ, 1400));
        g.adicionarAresta(new Aresta("a26", GO, MT, 1400));
        g.adicionarAresta(new Aresta("a27", GO, MS, 1100));
        g.adicionarAresta(new Aresta("a28", GO, MG, 980));
        g.adicionarAresta(new Aresta("a29", GO, TO, 340));
        g.adicionarAresta(new Aresta("a30", MA, PA, 580));
        g.adicionarAresta(new Aresta("a31", MA, PI, 1400));
        g.adicionarAresta(new Aresta("a32", MA, TO, 720));
        g.adicionarAresta(new Aresta("a33", MT, MS, 1600));
        g.adicionarAresta(new Aresta("a34", MT, PA, 180));
        g.adicionarAresta(new Aresta("a35", MT, RO, 120));
        g.adicionarAresta(new Aresta("a36", MT, TO, 730));
        g.adicionarAresta(new Aresta("a37", MS, MG, 400));
        g.adicionarAresta(new Aresta("a38", MS, PA, 900));
        g.adicionarAresta(new Aresta("a39", MS, SP, 430));
        g.adicionarAresta(new Aresta("a40", MG, RJ, 520));
        g.adicionarAresta(new Aresta("a41", MG, SP, 480));
        g.adicionarAresta(new Aresta("a42", PA, RR, 300));
        g.adicionarAresta(new Aresta("a43", PA, TO, 1000));
        g.adicionarAresta(new Aresta("a44", PB, PE, 800));
        g.adicionarAresta(new Aresta("a45", PB, RN, 1500));
        g.adicionarAresta(new Aresta("a46", PR, SC, 1500));
        g.adicionarAresta(new Aresta("a47", PR, SP, 1500));
        g.adicionarAresta(new Aresta("a48", PE, PI, 1500));
        g.adicionarAresta(new Aresta("a49", PE, RN, 1500));
        g.adicionarAresta(new Aresta("a50", PI, TO, 1500));
        g.adicionarAresta(new Aresta("a51", RJ, SP, 1500));
        g.adicionarAresta(new Aresta("a52", RS, SC, 1500));
    }

}