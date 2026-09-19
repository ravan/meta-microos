SUMMARY = "Cross distribution and cross architecture autoyast XML syntax checker"
DESCRIPTION = "Developing autoyast XML files for autoinstallation, this checker comes in \
really handy. It can compatibility check XML files and validate against \
all recent released SUSE distributions. \
Avoid time consuming fiddling and trial on error approaches. \
When you already have valid autoyast configuration files and you want to \
install more recent distributions, use this tool to verify that your XML \
syntax is still backward compatible. \
se this validator to make your XML autoyast files more robust and stable \
before even starting an auto-installation."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.9+gite8164d1"

RPM_NAME = "autoyast_xml_validator-1.0.9+gite8164d1-1.14.noarch.rpm"
RPM_HASH = "4b2debb7198b64adb07280dd733654a75069a3d5e57193c7709abd92b6226655069a4a37810063be5b225a09e69e21be355ccc679b32f4527e2512fac90b1c1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "autoyast-xml-validator"

RDEPENDS:${PN} += "/usr/bin/python3 \
jing \
libxml2-tools \
yast2-schema-collection"

inherit rpm
