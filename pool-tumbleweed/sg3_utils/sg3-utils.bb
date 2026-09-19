SUMMARY = "A collection of tools that send SCSI commands to devices"
DESCRIPTION = "The sg3_utils package contains utilities that send SCSI commands to \
devices. As well as devices on transports traditionally associated with \
SCSI (e.g. Fibre Channel (FCP), Serial Attached SCSI (SAS) and the SCSI \
Parallel Interface(SPI)) many other devices use SCSI command sets. \
ATAPI cd/dvd drives and SATA disks that connect via a translation layer \
or a bridge device are examples of devices that use SCSI command sets."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "1.48+36.936c7ae"

RPM_NAME = "sg3_utils-1.48+36.936c7ae-1.1.aarch64.rpm"
RPM_HASH = "80c304d93220ecc4e23a8e62385517fc76d4f0845d7d5f863a20cc7b3664b27e86ad045c6856bfc635cfadf80598485b902aba690dce422c3cb94a3af8c2e8c8"

RPROVIDES:${PN} += "scsi \
sg-utils \
sg3-utils"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsgutils2-1.48.so.2"

inherit rpm
