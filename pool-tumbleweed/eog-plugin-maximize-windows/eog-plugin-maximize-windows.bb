SUMMARY = "Eog maximize-windows plugin"
DESCRIPTION = "The Eye of Gnome Maximize Windows plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "eog-plugin-maximize-windows-44.1-2.3.aarch64.rpm"
RPM_HASH = "3c56d466eb4473e8dd7c02dbad3830b9b4de99382c6c8e8a6cf4a77ec5681d7cb2f4f797bde428e24034d5695504422e048a7d37b13e2fab910b83ffbbb0fc10"

RPROVIDES:${PN} += "eog-plugin-maximize-windows \
eog-plugins-/usr/lib64/eog/plugins/maximize-windows.plugin"

RDEPENDS:${PN} += "eog-plugins-data"

inherit rpm
