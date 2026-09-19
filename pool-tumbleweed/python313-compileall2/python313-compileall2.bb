SUMMARY = "Enhanced Python `compileall` module"
DESCRIPTION = "Enhanced Python `compileall` module."
LICENSE = "Python-2.0"

PV = "0.8.0"

RPM_NAME = "python313-compileall2-0.8.0-2.2.noarch.rpm"
RPM_HASH = "b0d75118cc6996911ebe91eb18b79294834cd9d795229af679cb6f88a1fdaf3894cc434bfdc0b1d22394fe79c57792d1c25b3544b535841d4d7b1b127077520c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-compileall2 \
python3.13dist-compileall2 \
python313-compileall2 \
python3dist-compileall2"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
