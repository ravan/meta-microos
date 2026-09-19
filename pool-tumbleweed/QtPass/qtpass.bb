SUMMARY = "A multi-platform gui for pass"
DESCRIPTION = "QtPass is a multi-platform GUI for pass, the standard unix password manager."
LICENSE = "GPL-3.0-only"

PV = "1.8.0"

RPM_NAME = "QtPass-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "f29b3c8ba0baf63e2639156c779c6a1c3f8843e443c6d4bcaac2ef65753725638bb9d11ad43f87e0811716baa37a17c468b41ad1732267c247fc6ffc9d171474"

RPROVIDES:${PN} += "QtPass \
qtpass"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
password-store"

inherit rpm
