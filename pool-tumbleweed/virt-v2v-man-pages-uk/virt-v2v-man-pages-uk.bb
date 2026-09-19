SUMMARY = "Ukrainian (uk) man pages for virt-v2v"
DESCRIPTION = "virt-v2v-man-pages-uk contains Ukrainian (uk) man pages \
for virt-v2v."
LICENSE = "GPL-2.0-or-later"

PV = "2.12.0"

RPM_NAME = "virt-v2v-man-pages-uk-2.12.0-1.1.noarch.rpm"
RPM_HASH = "4b47be4aa21a81088d2e0dc3f4103a14ee8747aef3a8b2cdf289cf972e016e5d7e0945568029f9f105545afe0f1eb410bd945ad00d7f151c34b6f8fe1d368e24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "virt-v2v-man-pages-uk"

RDEPENDS:${PN} += "virt-v2v"

inherit rpm
