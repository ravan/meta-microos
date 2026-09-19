SUMMARY = "Qt 6 HunspellInputMethod private library"
DESCRIPTION = "Internal library used by Qt for providing Hunspell support. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6HunspellInputMethod6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "627fa04c7084e8680fb9a5985c127e10cfe0c7b95f5c566b36e63b44a2cf02b9ae1a5a4b9c058c7855a9e41f626bc0f9d0958938c6d8ceb916bfacf631bd5ae9"

RPROVIDES:${PN} += "libQt6HunspellInputMethod.so.6 \
libQt6HunspellInputMethod6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6VirtualKeyboard.so.6 \
libc.so.6 \
libhunspell-1.7.so.0 \
libstdc++.so.6"

inherit rpm
