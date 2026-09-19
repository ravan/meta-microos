SUMMARY = "Header files for OpenSLP"
DESCRIPTION = "Service Location Protocol is an IETF standards track protocol that \
provides a framework that allows networking applications to discover \
the existence, location, and configuration of networked services in \
networks. \
 \
This package contains header and library files to compile applications \
with SLP support. It also contains developer documentation to develop \
such applications."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "openslp-devel-2.0.0-22.9.aarch64.rpm"
RPM_HASH = "946647230acf649e8addcd2e562da3c96b3c6f18c030fc04cf3946685ac2a388b938e54e1389591296ff7c7b2676baa82653f366f8a11b313d629b4f0ae99384"

RPROVIDES:${PN} += "openslp-devel"

RDEPENDS:${PN} += "libslp1 \
openssl-devel"

inherit rpm
