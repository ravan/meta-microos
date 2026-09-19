SUMMARY = "Binaries of linstor client"
DESCRIPTION = "Binaries of linstor client"
LICENSE = "GPL-3.0-only"

PV = "1.12.0"

RPM_NAME = "linstor-1.12.0-3.2.noarch.rpm"
RPM_HASH = "4363ad4d9acab059c96004a3ce34c11639453bff2504f423872c96bcd788e76c76dfc998673f24ac813cffa9b33a57650cd63a657dc6d979c68756e39e7c0796"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "linstor"

RDEPENDS:${PN} += "/usr/bin/python3.13"

inherit rpm
