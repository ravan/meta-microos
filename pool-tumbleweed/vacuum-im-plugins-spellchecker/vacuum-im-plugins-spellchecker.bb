SUMMARY = "Vacuum-IM spellchecker plugin"
DESCRIPTION = "Highlights words that may not be spelled correctly."
LICENSE = "GPL-3.0-only"

PV = "1.3.0+git1639054987.g0abd5e1"

RPM_NAME = "vacuum-im-plugins-spellchecker-1.3.0+git1639054987.g0abd5e1-1.9.aarch64.rpm"
RPM_HASH = "927cc122938064c3d112f9ba31542e48cd932aef5db3af7e1c636cd9454182f0f8e5e6a79c1e22e6e64d944216a64f58bee81fd8edb737ab3d7a88f990a8180d"

RPROVIDES:${PN} += "libspellchecker.so \
vacuum-im-plugins-spellchecker"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
libstdc++.so.6 \
libvacuumutils.so.37 \
libvacuumutils37 \
vacuum-im"

inherit rpm
