SUMMARY = "Open ImageMagick Security Policy"
DESCRIPTION = "This policy is designed for usage in secure settings like those \
protected by firewalls or within Docker containers. Within this framework, \
ImageMagick enjoys broad access to resources and functionalities. This policy \
provides convenient and adaptable options for image manipulation. However, \
it's important to note that it might present security vulnerabilities in \
less regulated conditions. Thus, organizations should thoroughly assess \
the appropriateness of the open policy according to their particular use \
case and security prerequisites."
LICENSE = "ImageMagick"

PV = "7.1.2.30"

RPM_NAME = "ImageMagick-config-7-upstream-open-7.1.2.30-1.1.noarch.rpm"
RPM_HASH = "6fc333634ba642f0780a3c0c467ea5725514276e56bc91c90054ffe236ab25e10ee4b4d63995a8e28835fddcb36b39886e78af0c1ab4c91ba4f13dadd884a8a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ImageMagick-config-7-upstream-open \
config-7-upstream \
config-ImageMagick-config-7-upstream-open \
imagick-config-7"

RDEPENDS:${PN} += ""

inherit rpm
