SUMMARY = "A parsing library for Python"
DESCRIPTION = "Lark is a general-purpose parsing library for Python. \
 \
With Lark, one can parse any context-free grammar with little code."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python313-lark-1.3.1-1.4.noarch.rpm"
RPM_HASH = "ae53be38c913ac5e20c51402c8505b2f4914c7f24d74b0ec6bd8cba07e1f5d02069c8a3f74dbcbe7fe93bcf8bb0692c25284df872e4ef6d0177b8d2e9fcd9448"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lark \
python3-lark-parser \
python3.13dist-lark \
python313-lark \
python313-lark-parser \
python3dist-lark"

RDEPENDS:${PN} += "python-abi"

inherit rpm
