SUMMARY = "Development files for compatibility with radiusclient-ng and freeradius-client"
DESCRIPTION = "This package contains the compatibility headers and libraries for freeradius-client and radiusclient-ng."
LICENSE = "BSD-2-Clause & MIT"

PV = "1.5.3"

RPM_NAME = "radcli-compat-devel-1.5.3-1.1.aarch64.rpm"
RPM_HASH = "d888e33a6ecd9f02c89fa29630e0bc4d903b487f3d6d3b6003ac252c44c36a1894e4d817868af724f8731aa85cdf663ce56cd7cfa957faefdb9b8f135739e35e"

RPROVIDES:${PN} += "freeradius-client-devel \
radcli-compat-devel"

RDEPENDS:${PN} += "libradcli10 \
radcli-devel"

inherit rpm
