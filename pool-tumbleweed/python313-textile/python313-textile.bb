SUMMARY = "Textile processing for python"
DESCRIPTION = "This is a Python implementation of the Textile \
(http://textism.com/tools/textile) markup language. \
 \
Textile is a XHTML generator using a simple markup developed by Dean \
Allen. This is a Python port with support for code validation, itex to \
MathML translation, Python code coloring and much more."
LICENSE = "BSD-3-Clause"

PV = "4.0.4"

RPM_NAME = "python313-textile-4.0.4-1.2.noarch.rpm"
RPM_HASH = "c0e96bc4abf59f343eb2caa1efbf3be5e6a2ff49518626299530a54ad1bb643574a148937bbf2a1a5f1017ca386e48ec26edd2e28864a75f0929f87b8eadedc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-textile \
python3.13dist-textile \
python313-textile \
python3dist-textile"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-nh3 \
python313-regex \
update-alternatives"

inherit rpm
