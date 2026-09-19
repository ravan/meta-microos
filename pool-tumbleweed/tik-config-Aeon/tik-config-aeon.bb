SUMMARY = "Aeon configuration for tik"
DESCRIPTION = "Aeon configuration for tik."
LICENSE = "MIT"

PV = "20240502"

RPM_NAME = "tik-config-Aeon-20240502-3.6.noarch.rpm"
RPM_HASH = "a5f167bf8559e04a7a06065d52e244a2490f7073bba871c0ed45f92eade5f8459502bc02936199f5378fde2646b1a7720a5ddacdea80bab7c0b4e0acc7ac60bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tik-config-Aeon \
tik-config \
tik-config-Aeon"

RDEPENDS:${PN} += ""

inherit rpm
