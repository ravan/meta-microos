SUMMARY = "Storage Fixup Script"
DESCRIPTION = "storage-fixup executes fixup commands for devices matched using dmi and \
hal properties.  This is primarily to adjust too aggressive ATA APM \
settings which makes the drive unload its head frequently shortening \
its lifespan."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "storage-fixup-0.2-51.7.noarch.rpm"
RPM_HASH = "8f28bb02d8f10037549f10abfbc62cd22935f519e3b9f9ef68b67e3e25ba5d9006c5efceebef827ee347cd2350fcc91871e6cebadc22fb66b28d1c01e56c1033"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-storage-fixup \
storage-fixup"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
bash \
coreutils \
dmidecode \
hdparm \
scsi \
sed \
smartmontools \
systemd"

inherit rpm
