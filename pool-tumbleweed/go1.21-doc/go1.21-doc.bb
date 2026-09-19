SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.21.13"

RPM_NAME = "go1.21-doc-1.21.13-11.2.aarch64.rpm"
RPM_HASH = "bbb91ba06f94ab64eb3be2dc4f491c642ea5b6f7d01ea38da788c93a81b5fe5de64bd2033a112f75d2b7b78c963570843d925fd03aa56d4acfefc4fd2a1e1938"

RPROVIDES:${PN} += "go-doc \
go1.21-doc"

RDEPENDS:${PN} += ""

inherit rpm
