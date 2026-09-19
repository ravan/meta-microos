SUMMARY = "Libcinnamon-desktop API -- Common Files"
DESCRIPTION = "cinnamon-desktop contains the libcinnamon-desktop library, the \
cinnamon-about program as well as some desktop-wide documents. \
 \
This package includes files that are shared between several \
Cinnamon applications (configuration schemas)."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "6.4.1"

RPM_NAME = "libcinnamon-desktop-data-6.4.1-1.8.noarch.rpm"
RPM_HASH = "24644916090e34ccac0614d407aaa975d3508795fbb260c6626df619a1168ad2e96fc04df6d109f3a2ac871c47639a1f70db4434eeb871759b1890c5d62f9efd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinnamon-desktop-lang \
libcinnamon-desktop-data"

RDEPENDS:${PN} += "libcinnamon-desktop-data-branding \
pam \
python3-gobject"

inherit rpm
