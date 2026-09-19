SUMMARY = "KIWI - Dracut kiwi Library"
DESCRIPTION = "This package contains a collection of methods to provide a library \
for tasks done in other kiwi dracut modules"
LICENSE = "GPL-3.0-or-later"

PV = "10.3.11"

RPM_NAME = "dracut-kiwi-lib-10.3.11-1.1.aarch64.rpm"
RPM_HASH = "302d38c17da3f398bd2cc7349773d8b833220a40280db36260d33b876856cc31f5e629309a6bcbad81e37ba9f0e59bbc484cfeeb877bf69bac4d7a5283568555"

RPROVIDES:${PN} += "dracut-kiwi-lib"

RDEPENDS:${PN} += "/usr/bin/bash \
bc \
btrfsprogs \
coreutils \
cryptsetup \
curl \
device-mapper \
dialog \
e2fsprogs \
gptfdisk \
grep \
lvm2 \
mdadm \
pv \
util-linux \
util-linux-systemd \
xfsprogs \
xz"

inherit rpm
