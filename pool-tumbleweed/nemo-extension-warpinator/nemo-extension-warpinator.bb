SUMMARY = "Warpinator extension for nemo"
DESCRIPTION = "Warpinator is a simple app that allows users to share files across the LAN. \
 \
This package provides an extension to use warpinator from nemo file browser."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.4"

RPM_NAME = "nemo-extension-warpinator-2.0.4-1.2.noarch.rpm"
RPM_HASH = "1bcfa649c3d65931746e2c6c75fb777e1e742ecd51d454c07336e1c90e2d041292c0f168fd38e0b067a64180faf5748c5ca451308f5ad71acae57aa35065fce6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-extension-warpinator"

RDEPENDS:${PN} += "/usr/bin/python3 \
nemo \
warpinator"

inherit rpm
