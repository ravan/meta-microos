SUMMARY = "OpenBao agent"
DESCRIPTION = "Files required to run a OpenBao agent"
LICENSE = "MPL-2.0"

PV = "2.6.2"

RPM_NAME = "openbao-agent-2.6.2-1.1.noarch.rpm"
RPM_HASH = "23907af0f5c7c0fe9fcf14d9db4de497bd01c5994809438430832a2da26302dd4c939ff67005d43a7b0ccda237f5627c7f747debb863ecb7ff5ef655bcb96603"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-openbao-agent \
openbao-agent"

RDEPENDS:${PN} += "/usr/bin/sh \
group-openbao \
openbao \
user-openbao"

inherit rpm
