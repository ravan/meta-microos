SUMMARY = "Tools to create OVA files from raw disk images"
DESCRIPTION = "Tools to create OVA files from raw disk images. This includes 'vmdk-convert' to \
create VMDKs from raw disk images, and 'ova-compose' to create OVA files \
that can be imported by VMware vSphere or Fusion and Workstation."
LICENSE = "Apache-2.0"

PV = "0.3.12"

RPM_NAME = "open-vmdk-0.3.12-4.1.aarch64.rpm"
RPM_HASH = "8602372cd11c7ca58d2bd50a8b4344b3ef7211bbb18e55ca3c95e696263c9715a1e8a092ba85b6fc824e065c3f7ef49d58e402c2055e7dc83653b12c504622eb"

RPROVIDES:${PN} += "config-open-vmdk \
open-vmdk"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
coreutils \
gawk \
grep \
libc.so.6 \
libz.so.1 \
python3-PyYAML \
python3-lxml \
sed \
tar \
util-linux"

inherit rpm
