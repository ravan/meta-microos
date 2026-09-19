SUMMARY = "Apache config file parser"
DESCRIPTION = "Apache / Config::General configuration file parser"
LICENSE = "BSD-2-Clause"

PV = "0.3.2"

RPM_NAME = "python314-apacheconfig-0.3.2-2.5.noarch.rpm"
RPM_HASH = "522bab1b1b9a4afb552390dc4323e61c38ba53e3c2ac49cb56e780fe3ba9d90189190cd55514f3041fa3b930da44bf4ed4f23e54114e0a55e6c491e2393f6977"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-apacheconfig \
python314-apacheconfig \
python3dist-apacheconfig"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-ply \
python314-six"

inherit rpm
