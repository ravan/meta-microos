SUMMARY = "Icinga monitoring module"
DESCRIPTION = "The Icinga monitoring module. \
IDO accessor and UI for your monitoring. This is the initial instalment for \
a graphical presentation of Icinga environments. The predecessor of Icinga DB."
LICENSE = "GPL-2.0-or-later"

PV = "2.12.6"

RPM_NAME = "icingaweb2-module-monitoring-2.12.6-1.3.noarch.rpm"
RPM_HASH = "cca10992544596599c0295a5f9ba2e60313958d73c0a17ad6f16f86df2f330654ea7880aad4ba2970db4f4515a9092986557ef4718b6fcf9b97a006df32b921b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingaweb2-module-monitoring"

RDEPENDS:${PN} += "icingaweb2 \
php"

inherit rpm
