SUMMARY = "Autoload driver for V4L2 loopback devices"
DESCRIPTION = "Configuration files to autoload the module during system startup."
LICENSE = "GPL-2.0-or-later"

PV = "0.15.4"

RPM_NAME = "v4l2loopback-autoload-0.15.4-2.2.noarch.rpm"
RPM_HASH = "3148419320588314a9c3fd0bca86e5fd6748f15a3a9a088d0b97b30dc16bbe964ac770c4449b59c1ba2435044ac9a3939e8ff22a49cdb69ed437061d80d06e13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "v4l2loopback-autoload"

RDEPENDS:${PN} += "systemd"

inherit rpm
