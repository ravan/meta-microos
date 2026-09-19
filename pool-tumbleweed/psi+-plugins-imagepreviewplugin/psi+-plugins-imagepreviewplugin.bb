SUMMARY = "Plugin for Psi"
DESCRIPTION = "This plugin shows the preview image for an image URL."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-plugins-imagepreviewplugin-1.5.2112+0-1.6.aarch64.rpm"
RPM_HASH = "8bbad4887a805a0bd748ff6cb827d88f9b9dd90c9c6bebbac856d1ac7137d25f7c97361cea20cefcbb76b1027c4ca0a42489d6de2072e6f5d1a2215a20b3d5e0"

RPROVIDES:${PN} += "libimagepreviewplugin.so \
psi+-plugins-imagepreviewplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
psi+"

inherit rpm
