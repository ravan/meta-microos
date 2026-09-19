SUMMARY = "Development files for the OpenPGM Reliable Multicast Protocol library"
DESCRIPTION = "OpenPGM is an implementation of the Pragmatic General Multicast (PGM) \
specification in RFC 3208. PGM is a reliable and scalable multicast protocol \
that enables receivers to detect loss, request retransmission of lost data, or \
notify an application of unrecoverable loss. \
 \
This subpackage contains the header files for OpenPGM."
LICENSE = "LGPL-2.1-or-later"

PV = "5.3.128"

RPM_NAME = "openpgm-devel-5.3.128-3.5.aarch64.rpm"
RPM_HASH = "b4bbcb4f066901ecd75fbc330a106bbc5beca1a834a68e849e527f12cbf406c6a022711be4ad1afc50687bfbd784f120c4e2f22d053390f1cf585f14873a1205"

RPROVIDES:${PN} += "openpgm-devel \
pkgconfig-openpgm-5.3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpgm-5-3-0"

inherit rpm
