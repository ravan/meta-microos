SUMMARY = "Open Fingerprint Architecture Library"
DESCRIPTION = "MusicDNS and the Open Fingerprint Architecture provide a system for \
identifying a piece of music with nothing more than the sound of the \
piece itself. \
This library is by design compatible with the MusicDNS web service. \
Non-commercial access to the service is available at \
http://www.musicdns.org."
LICENSE = "GPL-2.0-or-later | APL-1.0"

PV = "0.9.3"

RPM_NAME = "libofa0-0.9.3-105.9.aarch64.rpm"
RPM_HASH = "d2fdfbd879508317bcc0936bcfcac87d8b9a5b3a3c81faf591adc929584b7562eb19bdcd9fc23992ad7c5c4f5dd8ad5912743b5f778a4644e1350671401e257d"

RPROVIDES:${PN} += "libofa \
libofa.so.0 \
libofa0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
