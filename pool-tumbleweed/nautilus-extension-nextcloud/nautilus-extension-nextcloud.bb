SUMMARY = "Nautilus overlay icons"
DESCRIPTION = "This package provides overlay icons to visualise the \
synchronisation state in the Nautilus file manager."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "34.0.3"

RPM_NAME = "nautilus-extension-nextcloud-34.0.3-1.1.noarch.rpm"
RPM_HASH = "05770b65613b4dc8cf3b0d480247435e84699381f138d8f28b3b0a64ecf68fd3ea076f4634f9e722c077911a9ff347964736f5a881c86ee74027ce8b8a51e499"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nautilus-extension-nextcloud"

RDEPENDS:${PN} += "nautilus \
nextcloud-desktop \
python3-nautilus \
typelib-GObject \
typelib-Nautilus"

inherit rpm
