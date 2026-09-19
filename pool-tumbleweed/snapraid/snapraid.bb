SUMMARY = "Disk array backup for many large rarely-changed files"
DESCRIPTION = "SnapRAID is a backup program for disk arrays. It stores parity \
information of your data and it's able to recover from up to six disk \
failures. SnapRAID is mainly targeted for a home media center, with a \
lot of big files that rarely change."
LICENSE = "GPL-3.0-or-later"

PV = "14.9"

RPM_NAME = "snapraid-14.9-1.2.aarch64.rpm"
RPM_HASH = "8e48756f8d0e89da55931b98fb5a1c208a43f024900abaddc6620ed56944212bc1d95d33b78eacd70323127092f37cb01d54ed1e1f03e96e7c23e5773ea0e060"

RPROVIDES:${PN} += "config-snapraid \
snapraid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
