SUMMARY = "Firmware images for uhd"
DESCRIPTION = "This package contains binary firmware images for the Universal Hardware Driver (UHD)."
LICENSE = "GPL-3.0-or-later"

PV = "4.10.0.0"

RPM_NAME = "uhd-firmware-4.10.0.0-2.1.noarch.rpm"
RPM_HASH = "cf553f87eaae76529e8b51b39148804fa9fe238601bcc8b28aa2bd4b274a83bc51bde8cccd62a3aab3bd2b10bf0f259cfda505870478694fd25ee74191660c17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "uhd-firmware"

RDEPENDS:${PN} += "libuhd4-10-0"

inherit rpm
