SUMMARY = "Executables for python314-mcp"
DESCRIPTION = "This package contains the executables for python314-mcp."
LICENSE = "MIT"

PV = "1.28.1"

RPM_NAME = "python314-mcp-devel-1.28.1-1.3.noarch.rpm"
RPM_HASH = "45d289b1880284da851748b90b04851131c3baa02b5830e678a9318dd6bda81829d9b1e01f1f49765a7f61e732c68f7d149a1adcffe355ba43541da3b4c0cb7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-mcp-devel"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
update-alternatives"

inherit rpm
