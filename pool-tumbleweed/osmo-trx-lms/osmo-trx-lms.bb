SUMMARY = "SDR transceiver that implements Layer 1 of a GSM BTS (LimeSuite)"
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

RPM_NAME = "osmo-trx-lms-1.4.0-3.6.aarch64.rpm"
RPM_HASH = "45e44d43053ec4b98b82517d6b8dfec462a214a95a44f23fbf2dd7f0c55de6bf3c84dd0ab55b2adc4773400c74e46bf4ce42ec8f55e46101ef354ff189ef208a"

RPROVIDES:${PN} += "config-osmo-trx-lms \
osmo-trx-lms"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLimeSuite.so.23.11-1 \
libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libosmocore.so.22 \
libosmoctrl.so.0 \
libosmogsm.so.20 \
libosmovty.so.13 \
libstdc++.so.6 \
libtalloc.so.2"

inherit rpm
