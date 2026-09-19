SUMMARY = "Common files for GNOME Shell extensions"
DESCRIPTION = "This package provides files common to several GNOME Shell Extensions"
LICENSE = "GPL-2.0-or-later"

PV = "50.3"

RPM_NAME = "gnome-shell-extensions-common-50.3-1.1.noarch.rpm"
RPM_HASH = "1a7c1bdb5bad40e58c8a3745b8eea0d487105929647a7256285643da3b0271b74099b3b8d228e7fa9630756e6411d18f3e30a4981d7cb0a9fbf2fa95c8bbf1cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-extensions-common"

RDEPENDS:${PN} += "gnome-shell"

inherit rpm
