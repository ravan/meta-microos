SUMMARY = "Python compatibility headers"
DESCRIPTION = "py3c helps porting C extensions to Python 3. \
 \
It provides a guide, and a set of macros to facilitate porting \
and reduce boilerplate."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python313-py3c-1.4-2.5.noarch.rpm"
RPM_HASH = "f5669c74e4c0c8d310dd818702999b6077ca28cfb0b99069a828ebef688ba2f276d51383f9a7d77a7717ea483cd14de0300ea28c2e441bf834965b7d4dfcf6c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py3c \
python3.13dist-py3c \
python313-py3c \
python3dist-py3c"

RDEPENDS:${PN} += ""

inherit rpm
