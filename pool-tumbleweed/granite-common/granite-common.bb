SUMMARY = "Common files for the Granite development library"
DESCRIPTION = "This package contains the common files needed by the library."
LICENSE = "LGPL-3.0-or-later"

PV = "7.8.1"

RPM_NAME = "granite-common-7.8.1-1.3.noarch.rpm"
RPM_HASH = "10d9978273e452520b7416fa5d10265266b7d14777d51bd4a0fb66d2808b419e562db69346fb48a928f7f191cf4e8fe0a667a2f245fb2bc978cce01304c220e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "granite-common"

RDEPENDS:${PN} += ""

inherit rpm
