SUMMARY = "GAP: Minimal and Canonical images"
DESCRIPTION = "A GAP package for finding minimal and canonical images in \
permutation groups."
LICENSE = "MPL-2.0"

PV = "1.4.2"

RPM_NAME = "gap-images-1.4.2-1.1.noarch.rpm"
RPM_HASH = "a52ad834625cd3b38b2c240b2d1bc0b9494f3b288c3c4095b3fc1eb66f3c6181fca76a3c99bf9e0be9daa9915fd7a9d315d698d0e015be10b1afe0486135835c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-images"

RDEPENDS:${PN} += "gap-core \
gap-datastructures \
gap-digraphs"

inherit rpm
