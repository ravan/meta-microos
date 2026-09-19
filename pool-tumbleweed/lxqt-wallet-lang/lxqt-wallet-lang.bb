SUMMARY = "Translations for package lxqt-wallet"
DESCRIPTION = "Provides translations for the 'lxqt-wallet' package."
LICENSE = "BSD-2-Clause"

PV = "4.1.0"

RPM_NAME = "lxqt-wallet-lang-4.1.0-1.1.noarch.rpm"
RPM_HASH = "4f8d5486d3e9eb06bd0edfdbdc17268c9796e161af06f507c02dcae22e8eb2ba4843725b6a9f2a4d4d5258ef4315af76239740b3612a446a778fabe52ce786ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-wallet-lang \
lxqt-wallet-lang-all"

RDEPENDS:${PN} += "lxqt-wallet"

inherit rpm
