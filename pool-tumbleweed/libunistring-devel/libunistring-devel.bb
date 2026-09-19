SUMMARY = "Development files for the GNU Unicode string library"
DESCRIPTION = "Development files for programs using libunistring and documentation \
for UniString library."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "1.4.2"

RPM_NAME = "libunistring-devel-1.4.2-1.3.aarch64.rpm"
RPM_HASH = "3b44ff16c7fa531d38e22a3ed15ce86121b82453a64ec479b56be452cf91f7481949e209e2dcc8647e8314ebf164dcd1e948ef6a59d8312cc3e63d68c2f2d4d6"

RPROVIDES:${PN} += "libunistring-devel"

RDEPENDS:${PN} += "libunistring5"

inherit rpm
