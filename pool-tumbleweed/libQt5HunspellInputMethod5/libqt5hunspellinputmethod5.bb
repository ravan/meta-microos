SUMMARY = "Qt5 Hunspell Input Method"
DESCRIPTION = "Internal library used by Qt for providing Hunspell support."
LICENSE = "GPL-3.0"

PV = "5.15.19+kde0"

RPM_NAME = "libQt5HunspellInputMethod5-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "a95cde4b30e0bd86c3bf6bf30d7c37293a09f7b4ebf164b69165dd2047e3451ed812fa98ac59b0c9d15015a5d6679ff93795bf1083493a1838ec892a6faa2fbf"

RPROVIDES:${PN} += "libQt5HunspellInputMethod.so.5 \
libQt5HunspellInputMethod5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5VirtualKeyboard.so.5 \
libc.so.6 \
libhunspell-1.7.so.0 \
libstdc++.so.6"

inherit rpm
