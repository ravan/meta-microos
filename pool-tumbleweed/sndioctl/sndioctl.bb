SUMMARY = "Small audio and MIDI framework"
DESCRIPTION = "This package contains the controller binary for sndio."
LICENSE = "ISC"

PV = "1.10.0"

RPM_NAME = "sndioctl-1.10.0-1.5.aarch64.rpm"
RPM_HASH = "cf842e1b12a02fe85926504ed8b1938fce0c5d40a395d8907e9bf921efbdf3e6066faaf18f6dac6a9d0a36c1bba21152d64aa4326d55594bce35b78a067768ee"

RPROVIDES:${PN} += "sndioctl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsndio.so.7"

inherit rpm
