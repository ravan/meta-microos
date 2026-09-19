SUMMARY = "Performance Co-Pilot tools for exporting PCP metrics in XML format"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for exporting metric values \
in XML format."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-export-pcp2xml-6.3.8-3.1.noarch.rpm"
RPM_HASH = "de70b5068e04ef242939b201720f36c08d009da9292779e8bcedb7f6519d028cbbf23e3085206c9f52e2ed6081382da12918aa7f12092695f4758dc97ff42447"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-export-pcp2xml"

RDEPENDS:${PN} += "/usr/bin/pmpython \
libpcp3 \
python3-pcp"

inherit rpm
