SUMMARY = "A VNC server library"
DESCRIPTION = "A portable, uitlitarian and simple event loop library."
LICENSE = "ISC"

PV = "1.0.0"

RPM_NAME = "libaml1-1.0.0-1.3.aarch64.rpm"
RPM_HASH = "49e724098dd0ca458cd275f293cd7b56a83d058ae1091c987e380038f2fd839da3ccdff7456feed144596e7d2bd1c4bc07786cf9c3d9fede210d50490d175fa8"

RPROVIDES:${PN} += "libaml.so.1 \
libaml1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
