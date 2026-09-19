SUMMARY = "Cantonese input methods"
DESCRIPTION = "Cantonese input methods, including: \
Cantonese, Hong-Kong version of Cantonese."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.14"

RPM_NAME = "ibus-table-chinese-cantonese-1.8.14-1.6.noarch.rpm"
RPM_HASH = "2845638d86dbd0a42ac14bea1d8f9754df308b7e57557203a7e6b8976069e38823ea500e4529416181110d7383cc4ca853628021bf618359d90fb8e760c72e74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-cantonese \
ibus-table-chinese-cantonese \
locale-ibus-zh-TW;zh-HK"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus-table"

inherit rpm
