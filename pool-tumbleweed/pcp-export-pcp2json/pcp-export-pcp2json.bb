SUMMARY = "Performance Co-Pilot tools for exporting PCP metrics in JSON format"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for exporting metric values \
in JSON format."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-export-pcp2json-6.3.8-3.1.noarch.rpm"
RPM_HASH = "8d3e724e6ea57896c1b921b748a8c69381acabc814aa3e9950a549a28a6e8f1054dbe450f3ca6c9496dbfe31302a8b6fa3c94aec9595a7c845be4b8863a87c6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-export-pcp2json"

RDEPENDS:${PN} += "/usr/bin/pmpython \
libpcp3 \
python3-pcp"

inherit rpm
