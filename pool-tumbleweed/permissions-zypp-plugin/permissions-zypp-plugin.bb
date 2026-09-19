SUMMARY = "A zypper commit plugin for calling permctl"
DESCRIPTION = "This package contains a plugin for zypper that calls `permctl --system` after \
new packages have been installed. This is helpful for maintaining custom \
entries in /etc/permissions.local."
LICENSE = "GPL-2.0-or-later"

PV = "1699_20260806"

RPM_NAME = "permissions-zypp-plugin-1699_20260806-1.1.noarch.rpm"
RPM_HASH = "81fb6a5e631b10dc285d981e08018837b688dd11daecce83c9a3d0832e1ee6dd1b3ab0bd08d0a86134de4de2d12d6d68d79a048022d98c342438350ad847557a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "permissions-zypp-plugin"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
libzypp-plugin-commit \
permissions \
python3-zypp-plugin"

inherit rpm
