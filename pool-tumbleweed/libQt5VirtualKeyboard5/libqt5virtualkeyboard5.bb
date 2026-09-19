SUMMARY = "Qt5 Virtual Keyboard library"
DESCRIPTION = "Internal library used by Qt for providing Hunspell support."
LICENSE = "GPL-3.0"

PV = "5.15.19+kde0"

RPM_NAME = "libQt5VirtualKeyboard5-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "3abeb5bcc537121b4302823d2ebcfacdfc593f65d9c9f64aa0fc0da5d367f54e5179552e3e04a67aba5263005920955e41de3008630681120148694b3db6d543"

RPROVIDES:${PN} += "libQt5VirtualKeyboard.so.5 \
libQt5VirtualKeyboard5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
