SUMMARY = "Theme for LXQt"
DESCRIPTION = "openSUSE-default for LXQt lightweight Qt desktop environment"
LICENSE = "CC-BY-SA-4.0"

PV = "0.1"

RPM_NAME = "lxqt-theme-openSUSE-default-0.1-2.22.noarch.rpm"
RPM_HASH = "667c08b6f1447f0735eb53ebfab81f82798295d256233336894371a66aa26871d45ea586d0e7322c9c036a45cf259f8a6bad9b8063762f87b21c6e2afc404488"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-theme-openSUSE-default"

RDEPENDS:${PN} += "lxqt-themes"

inherit rpm
