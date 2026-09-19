SUMMARY = "Snapper Plugin for DNF"
DESCRIPTION = "Snapper Plugin for DNF, Python 3 version. Creates snapshot every transaction."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.2"

RPM_NAME = "python3-dnf-plugin-snapper-4.1.2-1.8.noarch.rpm"
RPM_HASH = "372a79e24a371e8bf6bdbb4f78e09a075ba4f64eaeda8254a45fabe309ff85d617fffbea7b896dda4a13b4c9fbb439b256cbe64b54bb6ba4b543edfef649206b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-python3-dnf-plugin-snapper \
dnf-plugin-snapper \
dnf-plugins-extras-snapper \
python3-dnf-plugin-snapper \
python3-dnf-plugins-extras-snapper"

RDEPENDS:${PN} += "python-abi \
python3-dbus-python \
python3-dnf-plugins-extras-common \
snapper"

inherit rpm
