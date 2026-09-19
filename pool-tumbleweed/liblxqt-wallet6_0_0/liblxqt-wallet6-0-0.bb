SUMMARY = "Library for lxqt-wallet"
DESCRIPTION = "This package contains the library files for lxqt-wallet."
LICENSE = "BSD-2-Clause"

PV = "4.1.0"

RPM_NAME = "liblxqt-wallet6_0_0-4.1.0-1.1.aarch64.rpm"
RPM_HASH = "c2fa16104cae991e858a6a1cfccfda3192639d5d959d46adcf28c7414b847d8126d359f968c34d3ee7da83f71dd5a155aa3b3402d708a42cb0c39a59c3257547"

RPROVIDES:${PN} += "liblxqt-wallet.so.6.0.0 \
liblxqt-wallet6-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Wallet.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libsecret-1.so.0 \
libstdc++.so.6"

inherit rpm
