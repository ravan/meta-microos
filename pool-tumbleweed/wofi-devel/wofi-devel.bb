SUMMARY = "Development files for wofi"
DESCRIPTION = "Headers for the wofi API which are needed to build wofi plugins."
LICENSE = "GPL-3.0-only"

PV = "1.5.3"

RPM_NAME = "wofi-devel-1.5.3-1.4.aarch64.rpm"
RPM_HASH = "5d207ec007e14b7e804e4769a345d738b10697d905986702a0e6a9c2a4c9b211e6be3a28971347089dd7c6b105255984f444ddba0c9ce2e4006156b6a3e058e1"

RPROVIDES:${PN} += "pkgconfig-wofi \
wofi-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-wayland-client \
wofi"

inherit rpm
