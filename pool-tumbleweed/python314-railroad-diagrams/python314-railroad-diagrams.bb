SUMMARY = "Railroad-Diagram Generator"
DESCRIPTION = "This is a small library for generating railroad diagrams (like what JSON.org uses) \
using SVG, with both JS and Python ports. \
 \
Railroad diagrams are a way of visually representing a grammar in a form that is more \
readable than using regular expressions or BNF. They can easily represent any \
context-free grammar, and some more powerful grammars. There are several railroad-diagram \
generators out there, but none of them had the visual appeal I wanted, so I wrote my own."
LICENSE = "CC0-1.0"

PV = "3.0.1"

RPM_NAME = "python314-railroad-diagrams-3.0.1-2.5.noarch.rpm"
RPM_HASH = "92e6052680b396ad43e0e87704beb214c505494801c2c05ce83b84c81a7c60e3f6ad85d72f1cb7c8609bf0199c0c32b40bfd86713e509f0d2e87cdcd78e89d71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-railroad-diagrams \
python314-railroad-diagrams \
python3dist-railroad-diagrams"

RDEPENDS:${PN} += "python-abi"

inherit rpm
