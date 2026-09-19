SUMMARY = "openSUSE Tumbleweed default wallpapers"
DESCRIPTION = "openSUSE Tumbleweed defaults wallpapers"
LICENSE = "BSD-3-Clause"

PV = "84.87.20240405"

RPM_NAME = "wallpaper-branding-openSUSE-84.87.20240405-5.5.noarch.rpm"
RPM_HASH = "632ef86c4bad6cf26d4aef3aa970875579c2b08d737fa7b228885e5f12bc4ec16fa2fd30a3bced04a95b9f149acf3e281dbd115b764b7ef28f0c74b939b62b4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wallpaper-branding \
wallpaper-branding-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
