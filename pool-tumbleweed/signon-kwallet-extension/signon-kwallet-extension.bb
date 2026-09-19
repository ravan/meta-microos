SUMMARY = "KWallet integration for signon framework"
DESCRIPTION = "KWallet integration for signon framework."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "signon-kwallet-extension-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "fd7b6dd89b017154dd857ca993c6a6b46e1e4302ea42fd98ae0062fd587bf3e296aff5d3d7d157ae1e50c709e71a041faa64ac17fb08cb307d6c946d79d7010e"

RPROVIDES:${PN} += "libkeyring-kwallet.so \
signon-kwallet-extension"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Wallet.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libsignon-extension.so.1 \
libstdc++.so.6"

inherit rpm
