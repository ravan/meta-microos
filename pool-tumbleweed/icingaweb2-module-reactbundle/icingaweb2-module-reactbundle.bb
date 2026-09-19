SUMMARY = "ReactPHP-based 3rd party libraries"
DESCRIPTION = "Icinga Web 2 - ReactPHP-based 3rd party libraries"
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "icingaweb2-module-reactbundle-0.9.0-1.21.noarch.rpm"
RPM_HASH = "06c9fd2b5f44d5622b8883ab4b92fff69a4cee29ae7ba2f40523858831d79c4efb79b863474302463120fd878705d622294fa83a0f975d5adc2cdb84db874b35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingaweb2-module-reactbundle"

RDEPENDS:${PN} += "icingaweb2 \
icingaweb2-module-director"

inherit rpm
