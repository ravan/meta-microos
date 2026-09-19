SUMMARY = "Install fonts automatically using PackageKit"
DESCRIPTION = "The PackageKit GTK3+ module allows any Pango application to install \
fonts from configured repositories using PackageKit."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.6"

RPM_NAME = "PackageKit-gtk3-module-1.3.6-2.1.aarch64.rpm"
RPM_HASH = "b375421bd1554cc49decd3edcfec6b9dddd49cdbb79dbe97ab16caa52e46fbe048a098e064e88564d2d272adc4c78361880efbc4b1ac1bd136d65c5737ff6b51"

RPROVIDES:${PN} += "PackageKit-gtk3-module \
libpk-gtk-module.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0"

inherit rpm
