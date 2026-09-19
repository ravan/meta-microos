SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "NCSA | MIT"

PV = "1.27"

RPM_NAME = "go-race-1.27-1.1.aarch64.rpm"
RPM_HASH = "12a15e689648705bdadae27b782996059e115b3ddbcdd4577c6bf602a35e2274372bd7686c00145b905e29138c800c0f960cf6362395bf897bde05fe204bdc19"

RPROVIDES:${PN} += "go-race \
golang-race"

RDEPENDS:${PN} += "go \
go1.27-race"

inherit rpm
