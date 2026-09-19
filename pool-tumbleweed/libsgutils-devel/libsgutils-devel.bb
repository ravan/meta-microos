SUMMARY = "A collection of tools that send SCSI commands to devices"
DESCRIPTION = "The sg3_utils package contains utilities that send SCSI commands to \
devices. As well as devices on transports traditionally associated with \
SCSI (e.g. Fibre Channel (FCP), Serial Attached SCSI (SAS) and the SCSI \
Parallel Interface(SPI)) many other devices use SCSI command sets. \
ATAPI cd/dvd drives and SATA disks that connect via a translation layer \
or a bridge device are examples of devices that use SCSI command sets. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libsgutils."
LICENSE = "BSD-3-Clause"

PV = "1.48+36.936c7ae"

RPM_NAME = "libsgutils-devel-1.48+36.936c7ae-1.1.aarch64.rpm"
RPM_HASH = "df42d3e6b40164f06d10175038d37abf11a741331cfaf84e8bda0722d2c45319fe65e9b14696eb59bde2ec8539b75223b06456510402341555f3d6788465dad0"

RPROVIDES:${PN} += "libsgutils-devel \
sg3-utils-devel"

RDEPENDS:${PN} += "libsgutils2-1-48-2"

inherit rpm
