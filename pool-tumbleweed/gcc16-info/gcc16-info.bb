SUMMARY = "Documentation for the GNU compiler collection"
DESCRIPTION = "GNU info-pages for the GNU compiler collection covering both user-level \
and internals documentation."
LICENSE = "GFDL-1.2-only"

PV = "16.2.0+git9497"

RPM_NAME = "gcc16-info-16.2.0+git9497-3.1.noarch.rpm"
RPM_HASH = "8cf49bda23edc7e004d4a0ba425290dcdec448c222439d55b4894848605435620465a0f60b2c020390ee50d1016fbabd89dcbc8c7c27264e07a11eb158ff1f39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcc16-info"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
