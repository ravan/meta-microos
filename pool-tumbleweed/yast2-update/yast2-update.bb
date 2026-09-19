SUMMARY = "YaST2 - Update"
DESCRIPTION = "Use this component if you wish to update your system."
LICENSE = "GPL-2.0-only"

PV = "5.0.2"

RPM_NAME = "yast2-update-5.0.2-1.2.aarch64.rpm"
RPM_HASH = "82f2c4a192bfaba389f7875d48fc368e03830107c67a7fb1300f873d73893fabf93f7957263aab746006bbedf39674b2c676940a6152e7a362105a052ef1f628"

RPROVIDES:${PN} += "yast2-installation-/usr/share/YaST2/clients/vendor.ycp \
yast2-update"

RDEPENDS:${PN} += "pigz \
rubygem-ruby-4.0.0-nokogiri \
yast2 \
yast2-installation \
yast2-packager \
yast2-pkg-bindings \
yast2-ruby-bindings \
yast2-storage-ng"

inherit rpm
