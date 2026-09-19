SUMMARY = "Japanese (ja) man pages for virt-v2v"
DESCRIPTION = "virt-v2v-man-pages-ja contains Japanese (ja) man pages \
for virt-v2v."
LICENSE = "GPL-2.0-or-later"

PV = "2.12.0"

RPM_NAME = "virt-v2v-man-pages-ja-2.12.0-1.1.noarch.rpm"
RPM_HASH = "93495d938148b07bc5cae4f5189748d1292be6d83a98994ffb6f8db3993327b05d85f0ac6f087be41e909edb8b56e636e5751bb6ac62f13a0c8d0633efd88b94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "virt-v2v-man-pages-ja"

RDEPENDS:${PN} += "virt-v2v"

inherit rpm
