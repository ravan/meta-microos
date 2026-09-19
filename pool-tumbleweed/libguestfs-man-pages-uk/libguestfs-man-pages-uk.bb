SUMMARY = "Ukrainian (uk) man pages for libguestfs"
DESCRIPTION = "libguestfs-man-pages-uk contains Ukrainian (uk) man pages \
for libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.60.1"

RPM_NAME = "libguestfs-man-pages-uk-1.60.1-1.1.noarch.rpm"
RPM_HASH = "f6bc7670d83fb86b0e27dd766c7f595a92482eae1b4e1a54889de580fe222e72beafa53bd98e3572a8d694b8e856136f9b24e247c1cfe742d1ea178bc434fc7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libguestfs-man-pages-uk"

RDEPENDS:${PN} += "libguestfs"

inherit rpm
