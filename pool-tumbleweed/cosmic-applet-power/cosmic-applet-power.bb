SUMMARY = "Debug sources for package cosmic-applets"
DESCRIPTION = "Debug sources for package cosmic-applets."
LICENSE = "GPL-3.0-only"

PV = "1.0.14"

RPM_NAME = "cosmic-applet-power-1.0.14-1.3.noarch.rpm"
RPM_HASH = "fa0fb6993f5ae24fccc42eb7d78740c9dd9c808eaed3265ccce12f55c6d9b737c9ffba09f0d660fcddaf0ad28301aec78466e6263926c8a250d83979838c7d6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cosmic-applet-power"

RDEPENDS:${PN} += "cosmic-applets"

inherit rpm
