SUMMARY = "Haifeng Wubi input method"
DESCRIPTION = "Haifeng Wubi input methods. Current includes: \
Haifeng Wubi 86."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.14"

RPM_NAME = "ibus-table-chinese-wubi-haifeng-1.8.14-1.6.noarch.rpm"
RPM_HASH = "51cf26f56ac5cd8bf9eec5a9c0d0e798e3fdcd1ad99a7b66705534db51b6f67be2b93dec0feb52bc8f9815d16881869178aa8e98266111829247e42ece88210a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-chinese-wubi-haifeng \
ibus-table-wubi \
locale-ibus-zh-CN"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus-table"

inherit rpm
