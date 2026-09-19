SUMMARY = "Shared GSettings Schemas for the Desktop"
DESCRIPTION = "A collection of GSettings schemas for settings shared by various \
components of a desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "50.1"

RPM_NAME = "gsettings-desktop-schemas-50.1-1.2.aarch64.rpm"
RPM_HASH = "8a22e17a777a6afd9a91f76a52a0b932e85bbf9bd1b0e7558cf2377e7475deadc14f95c9cdee25251684ec868533703f6df08fe187a93c9e6565d1aa276c35c7"

RPROVIDES:${PN} += "gsettings-desktop-schemas \
typelib-GDesktopEnums"

RDEPENDS:${PN} += ""

inherit rpm
