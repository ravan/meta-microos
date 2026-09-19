SUMMARY = "SCSI transport library"
DESCRIPTION = "libscg is a SCSI transport library, providing an abstraction \
layer from operating systems' mechanisms to issue SCSI commands."
LICENSE = "CDDL-1.0"

PV = "2024.03.21"

RPM_NAME = "libscg1_0-2024.03.21-53.5.aarch64.rpm"
RPM_HASH = "e26e6dc4facb65cbc9886c68343b95bece47ec8a0913a9ab4b374ea26b192b8d7a797a87a9626114aade83995b2621f130a1ec39eb060b33698762dada1a1bc8"

RPROVIDES:${PN} += "libscg.so.1.0 \
libscg1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libschily.so.2.0"

inherit rpm
