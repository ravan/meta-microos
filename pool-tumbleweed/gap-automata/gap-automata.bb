SUMMARY = "GAP: A package on automata"
DESCRIPTION = "The features of this package include \
 \
* Computing a rational expression for the language recognized by a \
  finite automaton; \
* Compute an automaton for the language given by a rational \
  expression; \
* Minimalize a finite automaton; \
* Has some features (using the external program GraphViz) to \
  visualize automata;"
LICENSE = "GPL-2.0-or-later"

PV = "1.17"

RPM_NAME = "gap-automata-1.17-1.1.noarch.rpm"
RPM_HASH = "3f76a3babba144bb02ff0f2b5408464284e88312fa8244c8943242e6c9894ab87d0f0b414f6773183effb39957f18002ede9dec02d92d53f3b1bec61c37c0c41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-automata"

RDEPENDS:${PN} += "gap-core \
graphviz"

inherit rpm
