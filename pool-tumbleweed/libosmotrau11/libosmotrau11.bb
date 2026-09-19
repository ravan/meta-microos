SUMMARY = "Osmocom GSM TRAU (E1/RTP) library"
DESCRIPTION = "This library implements the Transcoder and Rate Adaptation Unit (TRAU) for \
GSM systems. \
The TRAU enables the use of lower rates (32, 16 or 8 kbps) over the \
A-bis interface instead of the 64 kbps ISDN rate for which the Mobile \
Switching Center (MSC) is designed."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.0"

RPM_NAME = "libosmotrau11-2.2.0-1.1.aarch64.rpm"
RPM_HASH = "3174131f6f1a2d143a36e44b903adecc15ced1f735afffaea2489e93246be92f2ed9bd4993a0a7ef8eff999922bfdd65f6dd86db771943dabf5cb94d01c39750"

RPROVIDES:${PN} += "libosmotrau.so.11 \
libosmotrau11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocodec.so.4 \
libosmocore.so.22 \
libtalloc.so.2"

inherit rpm
