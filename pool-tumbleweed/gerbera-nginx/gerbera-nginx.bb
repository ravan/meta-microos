SUMMARY = "Nginx configuration for gerbera"
DESCRIPTION = "This subpackage contains the nginx configuration files"
LICENSE = "GPL-2.0-only"

PV = "3.2.1"

RPM_NAME = "gerbera-nginx-3.2.1-2.1.noarch.rpm"
RPM_HASH = "8254051e6f5007ea93b3ff4cf4684a1702130e0aeb8b15e9ae2044134373543b9487766daf91e741714821d721d52977fc03eee730721f0b5a69a2d59de50411"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-gerbera-nginx \
gerbera-nginx"

RDEPENDS:${PN} += "gerbera \
nginx"

inherit rpm
