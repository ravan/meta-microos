SUMMARY = "Translations for package libgpod"
DESCRIPTION = "Provides translations for the 'libgpod' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libgpod-lang-0.8.3-16.5.noarch.rpm"
RPM_HASH = "2a54e1c3c8c1ba67aaac03fa57eb56bece121ac71af739b1a64b10490331b900ed324bdebe5d4fe075a045a082432b10c9118ead20e3c6d7f43c93d30d3fbab8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgpod-lang \
libgpod-lang-all \
locale-libgpod-de \
locale-libgpod-es \
locale-libgpod-fr \
locale-libgpod-he \
locale-libgpod-it \
locale-libgpod-ja \
locale-libgpod-ro \
locale-libgpod-sv \
locale-libgpod-zh-CN"

RDEPENDS:${PN} += "libgpod"

inherit rpm
