SUMMARY = "Dedicated server for the Xonotic first person shooter"
DESCRIPTION = "Fast-paced first-person shooter. It provides arena shooter gameplay \
and is a direct successor of the Nexuiz project. \
 \
This subpackage contains the server with dedicated xonotic running as \
services unter the specific user. The service is handle via systemd or \
init, depending on your version."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.6"

RPM_NAME = "xonotic-server-0.8.6-6.8.aarch64.rpm"
RPM_HASH = "1a950bd3c714c86ce9b026f66fba7298db5c914680a794139f9da407b871bf6b72d284007a87cb7df1fead69bb1cbcfee21aa0110d808d1d811999a44c8495e7"

RPROVIDES:${PN} += "xonotic-server"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
group-xonotic \
ld-linux-aarch64.so.1 \
libc.so.6 \
libd0-blind-id.so.0 \
libjpeg.so.8 \
libm.so.6 \
libz.so.1 \
shadow \
systemd \
user-xonotic \
xonotic-data"

inherit rpm
