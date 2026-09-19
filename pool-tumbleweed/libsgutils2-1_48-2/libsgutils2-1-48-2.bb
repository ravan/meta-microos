SUMMARY = "Library to hold functions common to the SCSI utilities"
DESCRIPTION = "The sg3_utils package contains utilities that send SCSI commands to \
devices. As well as devices on transports traditionally associated with \
SCSI (e.g. Fibre Channel (FCP), Serial Attached SCSI (SAS) and the SCSI \
Parallel Interface(SPI)) many other devices use SCSI command sets. \
ATAPI cd/dvd drives and SATA disks that connect via a translation layer \
or a bridge device are examples of devices that use SCSI command sets. \
 \
This subpackage contains the library of common sg_utils code, such as \
SCSI error processing."
LICENSE = "BSD-3-Clause"

PV = "1.48+36.936c7ae"

RPM_NAME = "libsgutils2-1_48-2-1.48+36.936c7ae-1.1.aarch64.rpm"
RPM_HASH = "f0aac0fd393b5829c1538ecb6a41075a4e176b9e07e62ecab50b7833c17b6bb42fe7fa7c48b8350f3f70d4de5945402019af3bf915a5251a59a262947968af75"

RPROVIDES:${PN} += "libsgutils2-1-48-2 \
libsgutils2-1.48.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
