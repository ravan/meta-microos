SUMMARY = "An Implementation of Service Location Protocol V2"
DESCRIPTION = "Service Location Protocol is an IETF standards track protocol that \
provides a framework that allows networking applications to discover \
the existence, location, and configuration of networked services in \
networks. \
 \
OpenSLP is an open source implementation of the SLPv2 protocol as \
defined by RFC 2608 and RFC 2614.  This package includes the slptool \
and runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "openslp-2.0.0-22.9.aarch64.rpm"
RPM_HASH = "11e52433e26d2e587b43e92549d6d7d15225bf89726d2569702b2d69a90f87f3f6c161dcfc0cca075f56381c4cb30c96e0abd918188289d6f102c0b3c153cbb6"

RPROVIDES:${PN} += "config-openslp \
openslp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libslp.so.1"

inherit rpm
