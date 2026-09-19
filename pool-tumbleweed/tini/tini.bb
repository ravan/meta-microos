SUMMARY = "A tiny but valid init for containers"
DESCRIPTION = "Tini is a trivial implementation for an 'init' program. \
 \
All Tini does is spawn a single child (Tini is meant to be run in a container), \
and wait for it to exit, all the while reaping zombies and performing signal forwarding. \
 \
libc will be needed inside the container."
LICENSE = "MIT"

PV = "0.19.0"

RPM_NAME = "tini-0.19.0-3.6.aarch64.rpm"
RPM_HASH = "93140006fa1488021a62c5ec1b0ca4cdc3d01453c33cc926f283cab268632c4a68b0bd07658c0c163c2c459bd62d82b92a99f8ededb74f45656ec38022973ccc"

RPROVIDES:${PN} += "tini"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
