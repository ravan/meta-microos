SUMMARY = "Demonstrations and samples for xerces-j2"
DESCRIPTION = "Demonstrations and samples for xerces-j2."
LICENSE = "Apache-2.0 & W3C"

PV = "2.12.2"

RPM_NAME = "xerces-j2-demo-2.12.2-5.6.noarch.rpm"
RPM_HASH = "5a1c2c268724e74fe332ceb8518b21fe49f6417561c4d7d3139716e583d794ab9b9af2a27d0047fd43dc94fc5846a8a5cd65517582198be8b789f4275050886c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xerces-j2-demo"

RDEPENDS:${PN} += "xerces-j2"

inherit rpm
