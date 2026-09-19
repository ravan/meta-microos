SUMMARY = "SDR transceiver that implements Layer 1 of a GSM BTS"
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

RPM_NAME = "osmo-trx-1.4.0-3.6.aarch64.rpm"
RPM_HASH = "3ee0490ede98c4779f35819cc8b6eda53ffb96836fd9e002b157d192a6eccf752edacfc9af0659d785d47bb3472b3f7087cfdd67a231983c9442d43c5ef57f08"

RPROVIDES:${PN} += "osmo-trx"

RDEPENDS:${PN} += "systemd"

inherit rpm
