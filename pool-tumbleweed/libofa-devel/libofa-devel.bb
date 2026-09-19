SUMMARY = "Open Fingerprint Architecture Library"
DESCRIPTION = "MusicDNS and the Open Fingerprint Architecture provide a system for \
identifying a piece of music with nothing more than the sound of the \
piece itself. \
This library is by design compatible with the MusicDNS web service. \
Non-commercial access to the service is available at \
http://www.musicdns.org."
LICENSE = "GPL-2.0-or-later | APL-1.0"

PV = "0.9.3"

RPM_NAME = "libofa-devel-0.9.3-105.9.aarch64.rpm"
RPM_HASH = "335db33b2bb1ec2b12156a40bbf30a0dd610ab4659af3916cdcaa5c22cd7d06ddc4177c81ffb573be95a27cb637e0bc0ddf7bce0514c7e57e9e3908fd4c7cdba"

RPROVIDES:${PN} += "libofa-devel \
pkgconfig-libofa"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libofa0 \
pkgconfig-expat \
pkgconfig-fftw3"

inherit rpm
