SUMMARY = "Udev rules for XTRX USB devices"
DESCRIPTION = "Udev rules for XTRX USB devices."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20201202"

RPM_NAME = "xtrx-usb-udev-0.0.0+git.20201202-3.9.noarch.rpm"
RPM_HASH = "ff2a92005c58dd5c3cfd8f76af1b9e257d209d8d017e2674b98f480174928c915db8d4372c2f3b97cea94334660cd13d02301e73fcbb5f3a110086de3d5ded89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xtrx-udev \
xtrx-usb-udev"

RDEPENDS:${PN} += "/usr/bin/sh \
pwdutils"

inherit rpm
