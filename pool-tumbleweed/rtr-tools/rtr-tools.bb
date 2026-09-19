SUMMARY = "RPKI-RTR command line tools"
DESCRIPTION = "rtrclient is command line that connects to an RPKI-RTR server and prints \
protocol information and information about the fetched ROAs to the console. \
rpki-rov is a command line tool that connects to an RPKI-RTR server and \
allows one to validate given IP prefixes and origin ASes."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "rtr-tools-0.8.0-3.5.aarch64.rpm"
RPM_HASH = "e3a04360d945ee32536f2d0a3aa010d2ad0830e56b761f09e861f2f33a54de6099cc9ee62bf59a3d5f628616545e5ee7b0ac16d5ea46da6a9d1c40c1702fb3f1"

RPROVIDES:${PN} += "rtr-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librtr.so.0"

inherit rpm
