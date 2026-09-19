SUMMARY = "Translations for package lxqt-openssh-askpass"
DESCRIPTION = "Provides translations for the 'lxqt-openssh-askpass' package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "lxqt-openssh-askpass-lang-2.4.0-1.2.noarch.rpm"
RPM_HASH = "66dacba2ec5651f5a376b6152cb99dccf73afccfb45e2f0a1b789384279808aa81a65cfcef63e7ffd039fff98d8e8344db984f2be52e729ac3780658a8de9550"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-openssh-askpass-lang \
lxqt-openssh-askpass-lang-all"

RDEPENDS:${PN} += "lxqt-openssh-askpass"

inherit rpm
