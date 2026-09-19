SUMMARY = "Apache Web Log Analyzer"
DESCRIPTION = "GoAccess is an Apache web log analyzer that provides HTTP statistics \
for system administrators that require a visual report on the fly."
LICENSE = "GPL-2.0-or-later"

PV = "1.11"

RPM_NAME = "goaccess-1.11-1.2.aarch64.rpm"
RPM_HASH = "728232bc532ccd10fa57f49be8cd2d296c50c1f3c15777e39483100d61d5ad99d2dd8259ddd35f442574ef62c27c8f468988f1ce4398f339529fca4cb91fd006"

RPROVIDES:${PN} += "config-goaccess \
goaccess"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmaxminddb.so.0 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
