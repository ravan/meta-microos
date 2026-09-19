SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.22.12"

RPM_NAME = "go1.22-doc-1.22.12-7.2.aarch64.rpm"
RPM_HASH = "c26fe5665dd5d6e5bc2474a06b813b3424a47f1346c38571bf37d62ee52d5ca98ce5f8c9ef9f2dcc1cd032292022e779cd80298b8b3beef09a734aed99a3818e"

RPROVIDES:${PN} += "go-doc \
go1.22-doc"

RDEPENDS:${PN} += ""

inherit rpm
