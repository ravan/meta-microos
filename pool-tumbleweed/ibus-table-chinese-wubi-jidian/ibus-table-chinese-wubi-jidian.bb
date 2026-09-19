SUMMARY = "Jidian Wubi input method"
DESCRIPTION = "Jidian Wubi input methods. Current includes: \
Wubi 86."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.14"

RPM_NAME = "ibus-table-chinese-wubi-jidian-1.8.14-1.6.noarch.rpm"
RPM_HASH = "86fe28c3fe16a7beec3ac9b591f7872c6cccbd0584772d2881a7aed3a86377697907500733788d8db01e05d0e86e94e9f37da07293e65923449bc077d9ce4358"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-chinese-wubi-jidian \
ibus-table-wubi \
locale-ibus-zh-CN"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus-table"

inherit rpm
