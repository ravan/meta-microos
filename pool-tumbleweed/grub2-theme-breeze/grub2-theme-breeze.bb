SUMMARY = "Plasma branding for GRUB2's graphical console"
DESCRIPTION = "Plasma branding for the GRUB2's graphical console."
LICENSE = "GPL-3.0-or-later"

PV = "5.27.10"

RPM_NAME = "grub2-theme-breeze-5.27.10-1.9.noarch.rpm"
RPM_HASH = "9b10b4ba1911299d6a981f284a268a223b13dc6666b8758fd178ab2f46043639a791a718d0090bb4fb989e1ae521297e3ab66f7ad263ec1b157efa1d2d18d674"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-theme-breeze"

RDEPENDS:${PN} += ""

inherit rpm
