SUMMARY = "Graph data structures and algorithms"
DESCRIPTION = "graph data structures and algorithms"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.973.500"

RPM_NAME = "perl-Graph-0.973.500-1.7.noarch.rpm"
RPM_HASH = "d248c85804fc350de4ebd7f300e87dbd8cf7d633fc5f969ba93fc1e02e8eb93710336f925e1e6268263e2f6702f3a0c0cf60d45b739a0f964ab1e780c4453dc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Graph \
perl-Graph--AdjacencyMap \
perl-Graph--AdjacencyMap--Light \
perl-Graph--AdjacencyMatrix \
perl-Graph--Attribute \
perl-Graph--BitMatrix \
perl-Graph--Directed \
perl-Graph--MSTHeapElem \
perl-Graph--Matrix \
perl-Graph--SPTHeapElem \
perl-Graph--TransitiveClosure \
perl-Graph--TransitiveClosure--Matrix \
perl-Graph--Traversal \
perl-Graph--Traversal--BFS \
perl-Graph--Traversal--DFS \
perl-Graph--Undirected \
perl-Graph--UnionFind"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Heap \
perl-List--Util \
perl-Set--Object"

inherit rpm
