SUMMARY = "openSUSE Specific Customization of systemd defaults"
DESCRIPTION = "This package overrides some of the upstream default settings to make \
them better suited for openSUSE distributions."
LICENSE = "GPL-2.0-or-later"

PV = "0.10"

RPM_NAME = "systemd-default-settings-branding-openSUSE-0.10-1.7.noarch.rpm"
RPM_HASH = "b2935fd48c4bc47800cff965baad1f2121b5260e9b1e295a8bbca583dc3000d6f67fd3620214016ff3740aa380e1c0c291ee14f9ccb9d0c47ab713ecf3561b43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-default-settings-branding \
systemd-default-settings-branding-openSUSE"

RDEPENDS:${PN} += "systemd-default-settings"

inherit rpm
