SUMMARY = "Eog fullscreenbg plugin"
DESCRIPTION = "The Eye of Gnome Fullscreen Background plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "eog-plugin-fullscreenbg-44.1-2.3.aarch64.rpm"
RPM_HASH = "7b2c5c6282d161fab0d92cae3bdbcb1db18ecc87e704475f080bb2db237c0b68c3d5cfaa595962ce49a5f4ce8799b1f53a9af14c4ee9b5fba09fe4f712e51eeb"

RPROVIDES:${PN} += "eog-plugin-fullscreenbg \
eog-plugins-/usr/lib64/eog/plugins/fullscreenbg.plugin"

RDEPENDS:${PN} += "eog-plugins-data"

inherit rpm
