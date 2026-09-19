SUMMARY = "The mobile shell"
DESCRIPTION = "Remote terminal application that allows roaming, supports \
intermittent connectivity, and provides intelligent local echo and \
line editing of user keystrokes. \
 \
Mosh is a replacement for SSH. It's more robust and responsive, \
especially over Wi-Fi, cellular, and long-distance links."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.0"

RPM_NAME = "mosh-1.4.0-5.22.aarch64.rpm"
RPM_HASH = "70729ed3423e77a3e8dc7dc4f39b7de4c5791741bba036050be31d1e9ad82e433df8cc25f1e17ce731eaf5ea5dfc0c9e2277ad8a4d3dec1d4150a16a248ac4b6"

RPROVIDES:${PN} += "config-mosh \
mosh"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libabsl-log-internal-check-op.so.2608.0.0 \
libabsl-log-internal-message.so.2608.0.0 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libprotobuf.so.36.1.0 \
libstdc++.so.6 \
libtinfo.so.6 \
libutf8-range.so.36.1.0 \
libz.so.1 \
openssh \
perl-IO--Socket--IP \
perl-IO--Tty"

inherit rpm
