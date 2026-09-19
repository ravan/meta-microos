SUMMARY = "Plugins for the Single Sign On Framework"
DESCRIPTION = "This package contains the following plugins for the Single Sign On Framework: \
  * Password plugin \
  * Test plugin"
LICENSE = "LGPL-2.0-only"

PV = "8.61"

RPM_NAME = "signon-plugins-8.61-2.10.aarch64.rpm"
RPM_HASH = "162e172a312221a0fb8279ed422af3ab8c59b610f98406d5d8c15ca6b105d28bc3289b4a95c28ee1d9a6324bc8852eb31d52d55c872084771a2f95f539e54580"

RPROVIDES:${PN} += "libexampleplugin.so \
libpasswordplugin.so \
libsignon-plugins.so.1 \
libssotest2plugin.so \
libssotestplugin.so \
signon-plugins"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6 \
signond"

inherit rpm
