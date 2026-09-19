SUMMARY = "Qt 6 LottieVectorImageHelpers library"
DESCRIPTION = "The Qt 6 LottieVectorImageHelpers library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "libQt6LottieVectorImageHelpers6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "b8d45ab2e17fbf41f76212982d28ab27f072301d3fe0325f9fdb0253a2cdbf59703ecd351cc498388b399dfa27f9e3540a580c08fb30ec54e20e628a668abff7"

RPROVIDES:${PN} += "libQt6LottieVectorImageHelpers.so.6 \
libQt6LottieVectorImageHelpers6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
