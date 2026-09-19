SUMMARY = "Mathematica/Wolfram Language Lexer for Pygments"
DESCRIPTION = "A lexer and highlighter for Mathematica/Wolfram Language source code using the \
pygments engine."
LICENSE = "MIT"

PV = "10.0.0"

RPM_NAME = "python314-mathics-pygments-10.0.0-1.2.noarch.rpm"
RPM_HASH = "ae78c14de000cf6d2765754d4af9b8aff8fa3189ed7454cba7f1fc8e04a9a5716810ca2be56645d9509d04920facbf6ca626bd4bc320b4c34bd532dd11d3df35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mathics3-pygments \
python314-Mathics3-pygments \
python314-mathics-pygments \
python3dist-mathics3-pygments"

RDEPENDS:${PN} += "python-abi \
python314-Mathics-Scanner \
python314-Pygments"

inherit rpm
