SUMMARY = "Translations for package libdazzle"
DESCRIPTION = "Provides translations for the 'libdazzle' package."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.44.0"

RPM_NAME = "libdazzle-lang-3.44.0-2.7.noarch.rpm"
RPM_HASH = "f3006fcd15666395c45215c77b53b52f4996851ff3f40421ae982c61ab00fb0ef4a8de9eb51d8c21771dcb3133700bd5e55fcb010fd1fac0657f7c04edffbba1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libdazzle-lang \
libdazzle-lang-all \
locale-libdazzle-de \
locale-libdazzle-es \
locale-libdazzle-eu \
locale-libdazzle-pl \
locale-libdazzle-sv \
locale-libdazzle-uk \
locale-libdazzle-zh-CN"

RDEPENDS:${PN} += "libdazzle"

inherit rpm
