SUMMARY = "Systemd default presets for openSUSE"
DESCRIPTION = "Default presets for systemd on openSUSE distribution. \
 \
These are the openSUSE specific presets. The default \
presets needed for all SUSE based distributions can be \
found in systemd-presets-common-SUSE."
LICENSE = "GPL-2.0-or-later"

PV = "12.2"

RPM_NAME = "systemd-presets-branding-openSUSE-12.2-29.3.noarch.rpm"
RPM_HASH = "ea4d4619d95cbf9cbd3459223418d36dbf80d0b48a497f690163510ce8de7a4e1d3ed7cb2320ef88ec6ec5708009da86f20e1e7f1120a7e6c28dee16acfd90db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-presets-branding \
systemd-presets-branding-openSUSE"

RDEPENDS:${PN} += "/usr/bin/sh \
bash \
coreutils \
systemd-presets-common-SUSE"

inherit rpm
