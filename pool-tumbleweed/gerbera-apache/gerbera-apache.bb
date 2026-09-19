SUMMARY = "Apache configuration for gerbera"
DESCRIPTION = "This subpackage contains the Apache configuration files"
LICENSE = "GPL-2.0-only"

PV = "3.2.1"

RPM_NAME = "gerbera-apache-3.2.1-2.1.noarch.rpm"
RPM_HASH = "098cc17f86da97fd68412b717bd9ce802d5334c4ba04367bbe83af69a64146e87c325900b7601073383647dd369eb8b242fcca9566a8d102868730ecabb7c1b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-gerbera-apache \
gerbera-apache"

RDEPENDS:${PN} += "apache2 \
gerbera"

inherit rpm
