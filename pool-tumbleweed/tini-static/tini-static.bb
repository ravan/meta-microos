SUMMARY = "A tiny but valid init for containers, with libc linked statically"
DESCRIPTION = "Tini is a trivial implementation for an 'init' program. \
 \
All Tini does is spawn a single child (Tini is meant to be run in a container), \
and wait for it to exit, all the while reaping zombies and performing signal forwarding. \
 \
This variant is statically linked to libc so that it will not be \
needed inside the container."
LICENSE = "MIT"

PV = "0.19.0"

RPM_NAME = "tini-static-0.19.0-3.6.aarch64.rpm"
RPM_HASH = "7431dc4b4a4de0b238af7c2b10ef0a729d95c933004e4b68bebc19dbe0deeaa4f24990f34b366ec6031dfc833aa7f3407c6e8e1d98a3463011e7105e3cce2b52"

RPROVIDES:${PN} += "tini-static"

RDEPENDS:${PN} += ""

inherit rpm
