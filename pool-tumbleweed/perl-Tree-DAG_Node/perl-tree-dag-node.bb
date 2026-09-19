SUMMARY = "An N-ary tree"
DESCRIPTION = "This class encapsulates/makes/manipulates objects that represent nodes in a \
tree structure. The tree structure is not an object itself, but is emergent \
from the linkages you create between nodes. This class provides the methods \
for making linkages that can be used to build up a tree, while preventing \
you from ever making any kinds of linkages which are not allowed in a tree \
(such as having a node be its own mother or ancestor, or having a node have \
two mothers)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.390.0"

RPM_NAME = "perl-Tree-DAG_Node-1.390.0-1.1.noarch.rpm"
RPM_HASH = "a260e95afea4544eb5ff0982ce8c5ebfa86d44ffea0ada1831e8d6d92dbc97dbd3bf6915801a170761c56fe4c30231f3aa2509f205b0658bca645872633cb995"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Tree--DAG-Node \
perl-Tree-DAG-Node"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-ExtUtils--MakeMaker \
perl-File--Slurper \
perl-Getopt--Long"

inherit rpm
