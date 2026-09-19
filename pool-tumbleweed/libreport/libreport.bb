SUMMARY = "Generic library for reporting various problems"
DESCRIPTION = "Libraries providing API for reporting different problems in applications \
to different bug targets like Bugzilla, ftp, trac, etc."
LICENSE = "GPL-2.0-or-later"

PV = "2.17.15"

RPM_NAME = "libreport-2.17.15-1.13.aarch64.rpm"
RPM_HASH = "ba9d34c1fafefc0a1ee9430f85a5d671edbfe556f125b6f0f3b8dc06b0c22ea7e29a8d04fe6a4f7ad0eb0013e85fe39c6f3cb02507ab0a38e0ab29a101359c29"

RPROVIDES:${PN} += "config-libreport \
libreport"

RDEPENDS:${PN} += "/sbin/ldconfig \
glib2-tools \
libreport-filesystem \
satyr"

inherit rpm
