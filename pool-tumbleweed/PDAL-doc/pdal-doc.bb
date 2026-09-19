SUMMARY = "Documentation, examples and demos for PDAL"
DESCRIPTION = "This package provides the documentation and sources of examples and data demos of \
PDAL algorithms."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT & BSL-1.0"

PV = "2.10.2"

RPM_NAME = "PDAL-doc-2.10.2-1.1.noarch.rpm"
RPM_HASH = "85196ebce014e88819b1bd336df9029f93512ad7c9fadaadb24344c3279b547a6f65fa630c956d06d775500063c2c99c9eb233f96c3207dee21f5e34f2580c45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "PDAL-doc"

RDEPENDS:${PN} += ""

inherit rpm
