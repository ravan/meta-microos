SUMMARY = "Header Files and Libraries for dhcpctl API"
DESCRIPTION = "This package contains all of the libraries and headers for developing \
with the Internet Software Consortium (ISC) dhcpctl API."
LICENSE = "MPL-2.0"

PV = "4.4.3.P1"

RPM_NAME = "dhcp-devel-4.4.3.P1-1.2.aarch64.rpm"
RPM_HASH = "09150bbbd9571038a9e68e08e48571ebcd49e8169d7f4651738cfc994a125a33d4483639c3e72033c245ac8cc6b03b74198c3e88d12dd8bfabc6d37ac3d7f3bd"

RPROVIDES:${PN} += "dhcp-devel"

RDEPENDS:${PN} += "dhcp"

inherit rpm
