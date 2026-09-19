SUMMARY = "Performs a speedtest"
DESCRIPTION = "Performs a speedtest."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-speedtest-2.1.5-4.7.noarch.rpm"
RPM_HASH = "15cbc9d5639489131885ac197eccc2f78526009f757500bc5f69a30d54569c7212c471baf5016fa6e5d81ce566f21248e0fb477632130971721ec804a723dcb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-speedtest"

RDEPENDS:${PN} += "bumblebee-status \
speedtest-cli"

inherit rpm
