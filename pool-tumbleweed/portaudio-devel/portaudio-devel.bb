SUMMARY = "Development package for the portaudio library"
DESCRIPTION = "This package contains the files needed to compile programs that use the \
portaudio library."
LICENSE = "MIT"

PV = "190700_20210406"

RPM_NAME = "portaudio-devel-190700_20210406-1.19.aarch64.rpm"
RPM_HASH = "7b830ab72dfa4dc7d21acae6067d1917b587194631cfad6e4e66a6a099dabd8d6d652a818ce1999e87586efa5a8e3b3f3a04f720906fbe2c7323fa1c0c6bd49f"

RPROVIDES:${PN} += "pkgconfig-portaudio-2.0 \
pkgconfig-portaudiocpp \
portaudio-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libportaudio2 \
libportaudiocpp0 \
pkgconfig-alsa \
pkgconfig-portaudio-2.0"

inherit rpm
