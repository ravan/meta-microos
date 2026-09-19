SUMMARY = "SDR transceiver that implements Layer 1 of a GSM BTS (USRP1)"
DESCRIPTION = "OsmoTRX is a software-defined radio transceiver that implements the Layer 1 \
physical layer of a BTS comprising the following 3GPP specifications: \
 \
TS 05.01 'Physical layer on the radio path' \
TS 05.02 'Multiplexing and Multiple Access on the Radio Path' \
TS 05.04 'Modulation' \
TS 05.10 'Radio subsystem synchronization' \
 \
In this context, BTS is 'Base transceiver station'. It's the stations that \
connect mobile phones to the mobile network. \
 \
3GPP is the '3rd Generation Partnership Project' which is the collaboration \
between different telecommunication associations for developing new \
generations of mobile phone networks. (post-2G/GSM)"
LICENSE = "AGPL-3.0-or-later"

PV = "1.4.0"

RPM_NAME = "osmo-trx-usrp1-1.4.0-3.6.aarch64.rpm"
RPM_HASH = "312cf7f9748aa1103bf917b40c2e66fe859084c1b676cbb9b4580710c5860b8ba69677b32d7880c0f585d390f3a9448919d33c5b8595132a11ec8ff9fbdaaa28"

RPROVIDES:${PN} += "osmo-trx-usrp1"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libosmocore.so.22 \
libosmoctrl.so.0 \
libosmovty.so.13 \
libstdc++.so.6 \
libtalloc.so.2 \
libusrp.so.1"

inherit rpm
