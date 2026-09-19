SUMMARY = "Core Python libraries ported to MicroPython"
DESCRIPTION = "micropython-lib is a project to develop a non-monolothic standard library for MicroPython. \
Each module or package is available as a separate distribution package from PyPI. \
Each module is either written from scratch or ported from CPython."
LICENSE = "MIT & Python-2.0"

PV = "1.28.0"

RPM_NAME = "micropython-lib-1.28.0-1.2.noarch.rpm"
RPM_HASH = "b09629035918adb0a672389b603f43556bc872a447d2ac532ebf1eef9515459ab29c886f3c4e716968124c5111b741e77b6acc81360ecd0c3ecc049efa8356b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "micropython-lib"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
