SUMMARY = "Translation of man pages in Dutch"
DESCRIPTION = "This package provides translations of man pages in Dutch."
LICENSE = "GPL-3.0-or-later"

PV = "4.31.0"

RPM_NAME = "man-pages-nl-4.31.0-1.2.noarch.rpm"
RPM_HASH = "4a29d6bd37eea4a57592daec07c1217049a005f1c2a6e5a3802d5ccd0c1a07a92ff56aa47753144bf1bed35d109ec6205d265cc8ce87b1553a19744fec3e9fc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-nl \
man-pages-nl"

RDEPENDS:${PN} += "man-pages"

inherit rpm
