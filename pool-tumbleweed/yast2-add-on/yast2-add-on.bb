SUMMARY = "YaST2 - Add-On media installation code"
DESCRIPTION = "This package contains YaST Add-On media installation code."
LICENSE = "GPL-2.0-only"

PV = "5.0.2"

RPM_NAME = "yast2-add-on-5.0.2-1.1.noarch.rpm"
RPM_HASH = "956e509ee3bb31cdaf3949861cbac6e318d2e1d4b7005efc9d5ed3b658da9eb7a571bc32ffc2c0cf86a283648e91c69d3fb2a6a942a19af7560c275a62f5063e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-add-on"

RDEPENDS:${PN} += "autoyast2-installation \
yast2 \
yast2-country \
yast2-installation \
yast2-packager \
yast2-pkg-bindings \
yast2-ruby-bindings"

inherit rpm
