SUMMARY = "GAP: Majorana algebra and representation construction"
DESCRIPTION = "MajoranaAlgebras is a package for constructing Majorana \
representations of finite groups. It also offers some functions to \
calculate with a constructed Majorana representation. The main \
constructive functions use the algorithm described in the preprint \
Constructing Majorana Representations [arxiv.org/abs/1803.10723] by \
Markus Pfeiffer and Madeleine Whybrow."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.3"

RPM_NAME = "gap-majoranaalgebras-1.5.3-1.1.aarch64.rpm"
RPM_HASH = "c412ce6f9db745dbce15b128b842ded498889a3d787fdd1f6780e6b6777423c276caa6bd98694abb77452d105dda82d70776c600281d7f6e6f044ca27a13099d"

RPROVIDES:${PN} += "gap-majoranaalgebras"

RDEPENDS:${PN} += "gap-automata \
gap-core \
gap-datastructures \
gap-gapdoc \
gap-gauss"

inherit rpm
