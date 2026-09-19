SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.26.8"

RPM_NAME = "go1.26-doc-1.26.8-1.1.aarch64.rpm"
RPM_HASH = "e2836497535216feee83237afae63041b4cee1f4ea5f4506a7e3d0f279b2479fe7ea7dfc1c25c3cd3ff7967b82d875053a9c2a44c27560126376626a41fcc756"

RPROVIDES:${PN} += "go-doc \
go1.26-doc"

RDEPENDS:${PN} += ""

inherit rpm
