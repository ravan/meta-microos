SUMMARY = "Color themes for vifm"
DESCRIPTION = "Color themes for vifm file manager."
LICENSE = "GPL-2.0-only"

PV = "0.13"

RPM_NAME = "vifm-colors-0.13-1.9.noarch.rpm"
RPM_HASH = "819ad231762efa5dbbe93891389b038c661ad7e24baf0240800e27931c995b1c8bdeac150abb50999a7a8360a944b8745e66cac417aeb5ec409fe1bc51d33e01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-vifm-colors \
vifm-colors"

RDEPENDS:${PN} += "vifm"

inherit rpm
