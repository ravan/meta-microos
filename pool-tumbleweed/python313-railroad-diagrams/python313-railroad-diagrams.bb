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

RPM_NAME = "python313-railroad-diagrams-3.0.1-2.5.noarch.rpm"
RPM_HASH = "c7bd3cc9026d2856bb93cf9497404d14de7ad5384ae413d7c9460b4d15ddd7ba0b130ad6afd534e1323d180ae474cf34ab9af4c38a8e3056b5d4cc6dcf3e4ef7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-railroad-diagrams \
python3.13dist-railroad-diagrams \
python313-railroad-diagrams \
python3dist-railroad-diagrams"

RDEPENDS:${PN} += "python-abi"

inherit rpm
