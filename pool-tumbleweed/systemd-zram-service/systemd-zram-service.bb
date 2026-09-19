SUMMARY = "Systemd service for zram"
DESCRIPTION = "A successor to compcache, zRam, has been already integrated in the Linux kernel \
for a while now. This means that no additional compilation nor tweaking is \
required to benefit from compressing memory on the fly and massively reduced \
swapping. \
 \
This package contains command line scripts zramswapon, zramswapoff to enable \
zRam devices as required, or at boot time via a systemd service. \
 \
Individual Compressed RAM Block Devices are created based on cores/threads \
available, the size of each block device is calculated on cores/threads divided \
by total ram installed. The final total is then added to system swap."
LICENSE = "GPL-2.0-only"

PV = "0.2.1"

RPM_NAME = "systemd-zram-service-0.2.1-5.7.noarch.rpm"
RPM_HASH = "b4240463ee1a2cae7d1c584dadfe4d72aedaa191082479e4cc71206047630c3064cdec1141e5d0ed760a0268ec3d63ae0fe2f60fad3706e3e0e4c1e0c2a8e787"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-zram-service"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
kmod-zram.ko \
systemd"

inherit rpm
