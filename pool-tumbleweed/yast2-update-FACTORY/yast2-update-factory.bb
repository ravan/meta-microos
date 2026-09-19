SUMMARY = "YaST2 - Update"
DESCRIPTION = "Use this component if you wish to update your system."
LICENSE = "GPL-2.0-only"

PV = "5.0.2"

RPM_NAME = "yast2-update-FACTORY-5.0.2-1.2.aarch64.rpm"
RPM_HASH = "91f02800266934f929cd3c8e9c9b014e81552b5587413282827d9c9c6b8f0710ce4465a5a2877dd952a823cdf69b106cb1dec91cbc422e8889a5248d4a3804ed"

RPROVIDES:${PN} += "yast2-update-/usr/share/YaST2/clients/update.ycp \
yast2-update-FACTORY"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/touch \
fillup \
yast2 \
yast2-ruby-bindings \
yast2-update"

inherit rpm
