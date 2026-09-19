SUMMARY = "Light theme for LXQt"
DESCRIPTION = "openSUSE-light for LXQt lightweight Qt desktop environment"
LICENSE = "CC-BY-SA-4.0"

PV = "0.1"

RPM_NAME = "lxqt-theme-openSUSE-light-0.1-2.22.noarch.rpm"
RPM_HASH = "27f86e6cb253d39887ec2eb727ac305613997a32e8e545aae3cf0ca23cd25003a0b8002715ee42b54b67a55c039173819aad120ed2d1ad407b4d50a15a321f5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-theme-openSUSE-light"

RDEPENDS:${PN} += "lxqt-themes"

inherit rpm
