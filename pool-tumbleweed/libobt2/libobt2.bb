SUMMARY = "Openbox Toolkit Library"
DESCRIPTION = "This subpackage contains a utility function library used by Openbox \
to load and parse configuration and theme files of Openbox."
LICENSE = "GPL-2.0+"

PV = "3.6.1"

RPM_NAME = "libobt2-3.6.1-5.12.aarch64.rpm"
RPM_HASH = "c2fe56f5dd1db7afcfa12fda8880b4fc5a53a672e8ba79c84aa38359d073579ae417d854b851d23e2414fb6f892daf4993e78211a209408eb69e544be3e2061c"

RPROVIDES:${PN} += "libobt.so.2 \
libobt2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libc.so.6 \
libglib-2.0.so.0 \
libxml2.so.16"

inherit rpm
