SUMMARY = "Erbi input method"
DESCRIPTION = "Erbi input methods. Includes: \
Super Erbi (as erbi) \
and  Erbi Qin-Song (erbi-qs)"
LICENSE = "GPL-3.0-or-later"

PV = "1.8.14"

RPM_NAME = "ibus-table-chinese-erbi-1.8.14-1.6.noarch.rpm"
RPM_HASH = "002f467309df253b22d921e6e8ea4a9a715ef0bf3d07ad6733eef75bbd6c410fb3847d4a405c58013bdf94cb6303977f34949387c4331e490523987b5f288e8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-chinese-erbi \
ibus-table-erbi \
locale-ibus-zh-CN"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus-table"

inherit rpm
