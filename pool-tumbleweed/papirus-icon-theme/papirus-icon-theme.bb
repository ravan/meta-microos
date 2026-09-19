SUMMARY = "Papirus icon theme for Linux"
DESCRIPTION = "Papirus is an SVG icon theme, based on Paper with a few extras like \
hardcode-tray support, kde-color-scheme support, libreoffice icon theme, filezilla theme, smplayer themes ...) \
and other modifications. The theme is available for GTK and KDE. \
 \
This package contains the following icon themes: \
 \
Papirus \
Papirus-Dark \
Papirus-Light"
LICENSE = "GPL-3.0-only"

PV = "20260801"

RPM_NAME = "papirus-icon-theme-20260801-1.1.noarch.rpm"
RPM_HASH = "c7d5da1fa216353ea5ad0fc0c159d7e416cf4717214dd96adb27bba71ecadafb54f5af337b1e9f3d6cc9408f23a6651999a24c00e924e6792549b09dac0c885d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "papirus-icon-theme"

RDEPENDS:${PN} += "gtk3-tools"

inherit rpm
