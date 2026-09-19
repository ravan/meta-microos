SUMMARY = "Static libraries and headers for fastjet-contrib"
DESCRIPTION = "This package provides the static libraries for fastjet-contrib to link against."
LICENSE = "GPL-2.0-only"

PV = "1.054"

RPM_NAME = "fastjet-contrib-devel-static-1.054-1.8.aarch64.rpm"
RPM_HASH = "24ffef3bb86a2325a733d1b09f3b5f3de7baa4dca923a91828764df438106f2ffc434c131da0443b496fbd93c6a94e4c09a3d2591fa99a2fd122bd3090d74d11"

RPROVIDES:${PN} += "fastjet-contrib-devel-static"

RDEPENDS:${PN} += "fastjet-contrib-devel"

inherit rpm
