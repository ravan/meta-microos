SUMMARY = "SUSE Provided Configuration"
DESCRIPTION = "ImageMagick configuration as provided by SUSE. It is upstream 'secure' \
policy plus disable few other coders for reading and/or writing."
LICENSE = "ImageMagick"

PV = "7.1.2.30"

RPM_NAME = "ImageMagick-config-7-SUSE-7.1.2.30-1.1.noarch.rpm"
RPM_HASH = "f0cd5038ffb18cde470fd5a3e21931398e5c2e3f8497d583bd13aef4125d64a8bfc530421a14390536135f9ca4625f28367e8d6fcd18bf528c61e624cce00ed6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ImageMagick-config-7-SUSE \
imagick-config-7"

RDEPENDS:${PN} += ""

inherit rpm
