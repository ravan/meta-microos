SUMMARY = "The OpenSLP Implementation of the Service Location Protocol V2"
DESCRIPTION = "Service Location Protocol is an IETF standards track protocol that \
provides a framework that allows networking applications to discover \
the existence, location, and configuration of networked services in \
networks. \
 \
This package contains the SLP server. Every system, which provides any \
services that should be used via an SLP client must run this server and \
register the service."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "openslp-server-2.0.0-22.9.aarch64.rpm"
RPM_HASH = "ea7ce1aae06741782c3fa1ea26fe53fe73ba4989c756fa681ee89f1e7ef1fbec621d7e82e7caea8763a15f8d46a09606375a2a987daac9373232288f9985b76c"

RPROVIDES:${PN} += "config-openslp-server \
openslp-server"

RDEPENDS:${PN} += "/usr/bin/sh \
group-daemon \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libsystemd.so.0 \
openslp \
shadow \
systemd"

inherit rpm
