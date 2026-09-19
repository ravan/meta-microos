SUMMARY = "Mathematica/Wolfram Language Lexer for Pygments"
DESCRIPTION = "A lexer and highlighter for Mathematica/Wolfram Language source code using the \
pygments engine."
LICENSE = "MIT"

PV = "10.0.0"

RPM_NAME = "python313-mathics-pygments-10.0.0-1.2.noarch.rpm"
RPM_HASH = "be1068f5e789948cad33b6c3c469456ab00e6a3a3b1946f7457edf1107b73252cdaa7f3ef7b2338dbc70ccedd80d77872e592cdf4f1647b77881dffdeddb7587"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Mathics3-pygments \
python3-mathics-pygments \
python3.13dist-mathics3-pygments \
python313-Mathics3-pygments \
python313-mathics-pygments \
python3dist-mathics3-pygments"

RDEPENDS:${PN} += "python-abi \
python313-Mathics-Scanner \
python313-Pygments"

inherit rpm
