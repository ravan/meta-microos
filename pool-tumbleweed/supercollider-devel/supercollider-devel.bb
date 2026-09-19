SUMMARY = "Development files for SuperCollider"
DESCRIPTION = "This package includes include files and libraries neede to develop \
SuperCollider applications"
LICENSE = "GPL-3.0-only"

PV = "3.14.1"

RPM_NAME = "supercollider-devel-3.14.1-1.5.aarch64.rpm"
RPM_HASH = "f300424cb6ec852fd2df4cedc0acdc60b78582dc9bc0f2fcd8d39fd615998de4fc00bc9df38fd945482bd03c86e40b0f6d449b1643f7a1f3135f9b2f1f6a1229"

RPROVIDES:${PN} += "supercollider-devel"

RDEPENDS:${PN} += "alsa-devel \
avahi-devel \
libjack-devel \
libsndfile-devel \
libudev-devel \
pkgconfig \
supercollider"

inherit rpm
