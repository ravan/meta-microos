SUMMARY = "Python compatibility headers"
DESCRIPTION = "py3c helps porting C extensions to Python 3. \
 \
It provides a guide, and a set of macros to facilitate porting \
and reduce boilerplate."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python314-py3c-1.4-2.5.noarch.rpm"
RPM_HASH = "8b258478c884dc5c1242eebb37f4c74203cf9075c7ca39874bda45acec053f467804e2d26f8d915bee0ad7d385fac2675d4c07b88c66b8543218a66d05f47445"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-py3c \
python314-py3c \
python3dist-py3c"

RDEPENDS:${PN} += ""

inherit rpm
