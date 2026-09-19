SUMMARY = "Generic SUSE Customization of systemd defaults"
DESCRIPTION = "This package overrides some of the upstream default settings which are \
better suited for openSUSE or SLE distributions. \
 \
This package should not be installed alone but is supposed to be \
pulled in by the branding package instead."
LICENSE = "GPL-2.0-or-later"

PV = "0.10"

RPM_NAME = "systemd-default-settings-0.10-1.7.noarch.rpm"
RPM_HASH = "5905480df14a7e9dc45c702ee0a2aadd46d060bb0ea2c619f126d660ff1849eeedcbdd0f39b26c474c72214476b084ad0cd61a7a0594c2ec6b040e8a63976e79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-default-settings"

RDEPENDS:${PN} += "/usr/bin/sh \
systemd-default-settings-branding"

inherit rpm
