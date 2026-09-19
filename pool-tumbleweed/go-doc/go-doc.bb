SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.27"

RPM_NAME = "go-doc-1.27-1.1.aarch64.rpm"
RPM_HASH = "aa996f983a0e0c82acf2fbbdc8a9501a22f66bcdf8acfdc1bb4d23a7297b58fda60244c38056470c57c128b21375251623298d98d0491696057f7aec8bb0be2b"

RPROVIDES:${PN} += "go-doc \
golang-docs"

RDEPENDS:${PN} += "go \
go1.27-doc"

inherit rpm
