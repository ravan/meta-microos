SUMMARY = "YaST2 component for usbauth configuration"
DESCRIPTION = "YaST module that helps to create an usbauth firewall config file"
LICENSE = "GPL-2.0-only"

PV = "0.9"

RPM_NAME = "yast2-usbauth-0.9-1.24.noarch.rpm"
RPM_HASH = "02d62bb9098d26a7f26d4c3376d7ab22eb2fcb1de19dd15a8d09f5e4ff0d5f78d2fbbabc2c51c6f27abea290ca642fb2c6a7536899ec9dd8f50d0b9da1bc0f84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-usbauth"

RDEPENDS:${PN} += "libusbauth-configparser1 \
rubygem-ffi \
xdg-utils \
yast2 \
yast2-ruby-bindings"

inherit rpm
