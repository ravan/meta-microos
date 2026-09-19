SUMMARY = "NFC event daemon"
DESCRIPTION = "nfc-eventd is a daemon that looks for tags insertions/removes from \
NFC device. It is provided with two NEM (Nfc Eventd Modules) which \
allow many kind of usage of theses events."
LICENSE = "GPL-3.0+"

PV = "0.1.7"

RPM_NAME = "nfc-eventd-0.1.7-5.39.aarch64.rpm"
RPM_HASH = "50432a54954a421479737c1181191a4219fd46a360a689e67099c0b97c9d386719c994a5f5870637a3dfce2e8a7810c82b679dfe759b45bf7bd36aa4b4b05658"

RPROVIDES:${PN} += "config-nfc-eventd \
nfc-eventd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnfc.so.6"

inherit rpm
