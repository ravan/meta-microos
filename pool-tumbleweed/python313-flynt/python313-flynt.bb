SUMMARY = "CLI tool to convert a python project's  strings to f-strings"
DESCRIPTION = "CLI tool to convert a python project's  strings to f-strings."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "python313-flynt-1.0.6-1.6.noarch.rpm"
RPM_HASH = "a20f5d71ede7eabef7f57802d32e026e9a74a0226dc541b47dc8b0b10f3a41626e2d299d1dd414174c836188c1f74aa86d9929508657fcb313fee75168ad737e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flynt \
python3.13dist-flynt \
python313-flynt \
python3dist-flynt"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
