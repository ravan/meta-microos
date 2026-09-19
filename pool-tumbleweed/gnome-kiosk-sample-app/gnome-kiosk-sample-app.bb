SUMMARY = "Search appliance sample app"
DESCRIPTION = "Search appliance sample app that demonstate how the kiosk \
compositor is used."
LICENSE = "GPL-2.0-or-later"

PV = "50.1"

RPM_NAME = "gnome-kiosk-sample-app-50.1-1.2.noarch.rpm"
RPM_HASH = "20e325d40a34cf2949a497f423f48524034a2c83a9af93f6dae66882f77bd87a292c39828c7c8d36ddc66b7bc15ffcec50816e324aeb93d35746d2fc2641a7a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-kiosk-sample-app"

RDEPENDS:${PN} += "MozillaFirefox \
gnome-kiosk"

inherit rpm
