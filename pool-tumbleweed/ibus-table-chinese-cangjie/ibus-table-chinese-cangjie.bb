SUMMARY = "Cangjie based input methods"
DESCRIPTION = "Cangjie based input methods, including: \
Cangjie3, Canjie5, and Cangjie big tables."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.14"

RPM_NAME = "ibus-table-chinese-cangjie-1.8.14-1.6.noarch.rpm"
RPM_HASH = "e0cab906383d470a6968abb954a6bece263bc7e9aad41fba4e5eaa1411f35ac370221cf2aa6c04497de3f328f7c4bc576e32db63fc752743b17c18a437a5b182"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-cangjie \
ibus-table-chinese-cangjie \
locale-ibus-zh-TW;zh-HK"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus-table"

inherit rpm
