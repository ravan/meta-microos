SUMMARY = "Wallpaper and background images from Ubuntu MATE"
DESCRIPTION = "The default Ubuntu MATE wallpapers for the Ubuntu MATE releases."
LICENSE = "CC-BY-SA-3.0 & CC-BY-SA-4.0 & GPL-3.0-or-later"

PV = "22.04.17"

RPM_NAME = "ubuntu-mate-wallpapers-22.04.17-1.12.noarch.rpm"
RPM_HASH = "cd69e8df6acf16393692ef54935c50838cd5a6e9fe6777efa74a058032ac915495f6cc077a631854a79a4dbf9fe0a3e297c34d438dc289e9b77ae77ea9cbe428"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ubuntu-mate-wallpapers"

RDEPENDS:${PN} += ""

inherit rpm
