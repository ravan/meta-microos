SUMMARY = "MATE Weather common files"
DESCRIPTION = "libmateweather is a library to access weather information from \
online services for numerous locations."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.28.2"

RPM_NAME = "mateweather-common-1.28.2-1.4.noarch.rpm"
RPM_HASH = "0a51f29a1e640de9ef24ac8dbc272c2251aad8b4fe97c85ff660f67ebafbed0e05034372169df323343b48b18ac8932fe5b5bdcb4c405cc67a693c2a5b913bbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mateweather-common"

RDEPENDS:${PN} += ""

inherit rpm
