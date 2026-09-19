SUMMARY = "Simple Scanning Utility"
DESCRIPTION = "Simple Scan is an easy-to-use application, designed to let users connect \
their scanner and quickly have the image/document in an appropriate \
format. \
 \
Simple Scan is basically a frontend for SANE - which is the same backend \
as XSANE uses. This means that all existing scanners will work and the \
interface is well tested."
LICENSE = "GPL-3.0-or-later"

PV = "50.0"

RPM_NAME = "simple-scan-50.0-1.3.aarch64.rpm"
RPM_HASH = "7f0c93ea0fe06afea64d261408e20671a1d6b738ed27e3bb05d228206b3f096c573f2d435b72f03b44a108506190f2419ef6185ffb793b68474aa1a2f6fb3019"

RPROVIDES:${PN} += "simple-scan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libcolord.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libgusb.so.2 \
libpackagekit-glib2.so.18 \
libsane.so.1 \
libwebp.so.7 \
libwebpmux.so.3 \
libz.so.1 \
xdg-utils"

inherit rpm
