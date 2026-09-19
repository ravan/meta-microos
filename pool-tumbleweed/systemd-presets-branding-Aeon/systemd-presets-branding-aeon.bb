SUMMARY = "Systemd default presets for openSUSE Aeon"
DESCRIPTION = "Default presets for systemd on openSUSE Aeon"
LICENSE = "MIT"

PV = "20231005"

RPM_NAME = "systemd-presets-branding-Aeon-20231005-9.3.noarch.rpm"
RPM_HASH = "b7cf2a6139b663234b0f6f35b6e70c6bfced2956282f48b733428df03b6127cdd3ebea52bff7c097080ed1349b357d371748798c068f1ba8f43be5e657507da3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-presets-branding \
systemd-presets-branding-Aeon"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
systemd-presets-common-SUSE"

inherit rpm
