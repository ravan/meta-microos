SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.23.12"

RPM_NAME = "go1.23-doc-1.23.12-6.2.aarch64.rpm"
RPM_HASH = "42aca72ac05f89296a0c072a2be67699d517ce32cec6f40def453d011a7913621469ac9f5581f2ca710597a962cdbf41fa5f0e29502ccf77dc39234975d2347a"

RPROVIDES:${PN} += "go-doc \
go1.23-doc"

RDEPENDS:${PN} += ""

inherit rpm
