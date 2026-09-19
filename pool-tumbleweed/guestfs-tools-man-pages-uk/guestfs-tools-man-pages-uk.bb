SUMMARY = "Ukrainian (uk) man pages for guestfs-tools"
DESCRIPTION = "guestfs-tools-man-pages-uk contains Ukrainian (uk) man pages \
for guestfs-tools."
LICENSE = "GPL-2.0-or-later"

PV = "1.56.0"

RPM_NAME = "guestfs-tools-man-pages-uk-1.56.0-1.2.noarch.rpm"
RPM_HASH = "3bcf468f2fe06984fd13b040a062c570df2b0d8866e2030ac7d6ae78923a35f75828bce09d933532a91f3b5b59ba5be66d426ad13826ae38f2a392e1a7ce78a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guestfs-tools-man-pages-uk"

RDEPENDS:${PN} += "guestfs-tools"

inherit rpm
