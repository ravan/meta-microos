SUMMARY = "Firmware files for the URSP1 SDR"
DESCRIPTION = "Firmware files for the USRP1 SDR."
LICENSE = "GPL-3.0-or-later"

PV = "3.4.11"

RPM_NAME = "usrp-firmware-3.4.11-1.4.noarch.rpm"
RPM_HASH = "c0d73bc39a186a65df44b301fb883ab7c3ec2989ad643f1baa7522b138d93c7efc08b24a7927fdd0b56ea3ffe93df09784d764ee770c5ca770c2314414c4bc56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "usrp-firmware"

RDEPENDS:${PN} += "usrp-tools"

inherit rpm
