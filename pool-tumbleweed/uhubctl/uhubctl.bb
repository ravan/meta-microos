SUMMARY = "USB hub per-port power control"
DESCRIPTION = "uhubctl is utility to control USB power per-port on smart USB hubs. \
Smart hub is defined as one that implements per-port power switching."
LICENSE = "GPL-2.0-only"

PV = "2.6.0"

RPM_NAME = "uhubctl-2.6.0-1.8.aarch64.rpm"
RPM_HASH = "718cdcfafb9b06c4013d46972bcab0579cfb854b05a521abfe10b64a2e99307ec0b886ccfddf3f4ab932a6b7a18f9049fb0ccc9ee95db6b6fad81a8f4ee31fe9"

RPROVIDES:${PN} += "uhubctl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
