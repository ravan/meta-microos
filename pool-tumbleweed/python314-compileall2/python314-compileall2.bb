SUMMARY = "Enhanced Python `compileall` module"
DESCRIPTION = "Enhanced Python `compileall` module."
LICENSE = "Python-2.0"

PV = "0.8.0"

RPM_NAME = "python314-compileall2-0.8.0-2.2.noarch.rpm"
RPM_HASH = "d2ca403d8c670ba6b042620841b37dbaffa377d462a20b3809d6fc274251859cbff2cfe95d78d11d50ae4ac37c009d9f3b0dd12d8dd9da69d15ebc94fd7e21d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-compileall2 \
python314-compileall2 \
python3dist-compileall2"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
