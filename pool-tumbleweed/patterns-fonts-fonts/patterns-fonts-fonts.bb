SUMMARY = "Fonts"
DESCRIPTION = "Base fonts and font configuration."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-fonts-fonts-20170319-13.2.aarch64.rpm"
RPM_HASH = "a08f6aa441f29ca07cf7f18d23d238464bb62602156cc0890344f69a35f4e09cffb652c06278350c44c93ee620f8b9e0f6724704945d66f0885ec76cb6ecedac"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-fonts-fonts"

RDEPENDS:${PN} += "dejavu-fonts \
google-roboto-fonts \
intlfonts-euro-bitmap-fonts \
liberation-fonts \
xorg-x11-fonts-core"

inherit rpm
