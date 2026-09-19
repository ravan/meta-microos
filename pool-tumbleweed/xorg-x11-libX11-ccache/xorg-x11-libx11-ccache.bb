SUMMARY = "X"
DESCRIPTION = "Cache for X.Org compose files."
LICENSE = "MIT"

PV = "7.6"

RPM_NAME = "xorg-x11-libX11-ccache-7.6-22.18.aarch64.rpm"
RPM_HASH = "7d075d126e03f949a3cb7c96cf1919efe2aad28506b40c2e85cc87dcfc8db1d2c83986946d26f01a48ff1469ae95f6659780fc5b5e6a8e1fdce7b673001f9e31"

RPROVIDES:${PN} += "xorg-x11-/var/X11R6/compose-cache/ \
xorg-x11-libX11-ccache"

RDEPENDS:${PN} += ""

inherit rpm
