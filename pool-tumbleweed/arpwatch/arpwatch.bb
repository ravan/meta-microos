SUMMARY = "Tool to keep track of Ethernet<->IP address pairings"
DESCRIPTION = "Arpwatch keeps track of Ethernet and IP address pairings. It logs \
activity to syslog and reports certain changes via e-mail."
LICENSE = "BSD-3-Clause"

PV = "3.9"

RPM_NAME = "arpwatch-3.9-1.4.aarch64.rpm"
RPM_HASH = "52c56cf252235b95eb89c76b00ae06ba4c09c3eadb33c3e69a51a859cf057636b067d0788c020f711de01c04e8740d527e81b8339255f359f4bffd235882c3b6"

RPROVIDES:${PN} += "arpwatch"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
arpwatch-ethercodes \
coreutils \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcap.so.1 \
libresolv.so.2"

inherit rpm
