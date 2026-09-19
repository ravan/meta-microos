SUMMARY = "Qt 5 Speech Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
The module enables a Qt application to support accessibility features \
such as text-to-speech, which is useful for end-users who are visually \
challenged or cannot access the application for whatever reason."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde1"

RPM_NAME = "libQt5TextToSpeech5-5.15.19+kde1-1.2.aarch64.rpm"
RPM_HASH = "df4dd38aeaec22678e414ed6c1c4a74232fe7abe9e23d8a4016396eb60f7ffa72e38b1eca0c27785a2cba3a7b2d005885057e1e1a29cd0b998e78c51365e1de2"

RPROVIDES:${PN} += "libQt5TextToSpeech.so.5 \
libQt5TextToSpeech5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
