SUMMARY = "A CD Digital Audio Extraction tool"
DESCRIPTION = "cdda2wav can retrieve CDDA audio tracks from CDROM drives that are \
capable of reading audio data digitally to the host via SCSI."
LICENSE = "CDDL-1.0"

PV = "3.02~a10"

RPM_NAME = "cdda2wav-3.02~a10-53.5.aarch64.rpm"
RPM_HASH = "61e9a6a8df764af7a27bb5cd064726058941ec8dc07fb0f0f2e745789ea55720652e9c5831a909a647dcd0ceac33d9fe06ea5fd5ae4c438170caf0b65408ca24"

RPROVIDES:${PN} += "cdda2wav"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcdrdeflt.so.1.0 \
libparanoia.so.1.0 \
librscg.so.1.0 \
libscg.so.1.0 \
libscgcmd.so.1.0 \
libschily.so.2.0 \
permissions"

inherit rpm
