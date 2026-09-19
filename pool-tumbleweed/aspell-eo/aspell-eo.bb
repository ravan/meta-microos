SUMMARY = "Esperanto Dictionary for Aspell"
DESCRIPTION = "An Esperanto dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.20000225"

RPM_NAME = "aspell-eo-2.1.20000225-4.7.aarch64.rpm"
RPM_HASH = "54e0877fb0b4f7c105e23aac05277b8c537eae99c87a6fd079f62bb76d02b5ea964fdc48d5b21353e6650350fae743dcf9d99c8808df118b27a718eb7360d129"

RPROVIDES:${PN} += "aspell-eo \
locale-aspell-eo"

RDEPENDS:${PN} += ""

inherit rpm
