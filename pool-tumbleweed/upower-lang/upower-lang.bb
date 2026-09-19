SUMMARY = "Translations for package upower"
DESCRIPTION = "Provides translations for the 'upower' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.91.3"

RPM_NAME = "upower-lang-1.91.3-1.2.noarch.rpm"
RPM_HASH = "86c84acd8ce56c10f4a0d51cf868971cdfcf264ade8e69343fc7f5a381e85ce526019ce680c36624cea2024e38566402f2e7ef3452ec03a208ea0140c850903d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-upower-fr \
locale-upower-it \
locale-upower-ka \
locale-upower-pl \
locale-upower-sv \
upower-lang \
upower-lang-all"

RDEPENDS:${PN} += "upower"

inherit rpm
