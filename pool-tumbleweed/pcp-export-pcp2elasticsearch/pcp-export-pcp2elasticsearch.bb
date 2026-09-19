SUMMARY = "Performance Co-Pilot tools for exporting PCP metrics to ElasticSearch"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for exporting metric values \
to Elasticsearch - a distributed, RESTful search and analytics engine. \
See https://www.elastic.co/community for further details."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-export-pcp2elasticsearch-6.3.8-3.1.noarch.rpm"
RPM_HASH = "8b0afcbd4b56f2662b46c975de7f0949f758ef3d0f52d8e49c919a7f12df574e2c205af377d4e73282782d1537eac3dfe1be155bc588f74604f49abe64841388"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-export-pcp2elasticsearch"

RDEPENDS:${PN} += "/usr/bin/pmpython \
libpcp3 \
python3-pcp \
python3-requests"

inherit rpm
