SUMMARY = "Japanese (ja) man pages for libguestfs"
DESCRIPTION = "libguestfs-man-pages-ja contains Japanese (ja) man pages \
for libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.60.1"

RPM_NAME = "libguestfs-man-pages-ja-1.60.1-1.1.noarch.rpm"
RPM_HASH = "c4f60984100067db2df655236d9d2c33f7d3f5451debeed80b877682624b69c5cbd843ecb8eb6619cd0f15b3eb35a446294998ea3c6ce83ab8bbac5d3987d8a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libguestfs-man-pages-ja"

RDEPENDS:${PN} += "libguestfs"

inherit rpm
