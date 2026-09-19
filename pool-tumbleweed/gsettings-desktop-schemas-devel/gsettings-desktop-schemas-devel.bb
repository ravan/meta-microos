SUMMARY = "Shared GSettings Schemas for the Desktop -- Development Files"
DESCRIPTION = "A collection of GSettings schemas for settings shared by various \
components of a desktop. \
 \
This package contains development files."
LICENSE = "GPL-2.0-or-later"

PV = "50.1"

RPM_NAME = "gsettings-desktop-schemas-devel-50.1-1.2.aarch64.rpm"
RPM_HASH = "1fcf4f280e756d2546255aecbfdeb8cb4913f06696545c0e012de6da5e89565fa8f81342edd2cd704113a8efb6013bc7524c7576d000bc043cbecc98a57c727c"

RPROVIDES:${PN} += "gsettings-desktop-schemas-devel \
pkgconfig-gsettings-desktop-schemas"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gsettings-desktop-schemas"

inherit rpm
