SUMMARY = "Erlang/OTP Diameter application sources"
DESCRIPTION = "Erlang sources for the Diameter application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "27.1.3"

RPM_NAME = "erlang27-diameter-src-27.1.3-3.1.aarch64.rpm"
RPM_HASH = "858ddc9491fbac0cbecdfa37223d734ffbdfede97fa087d852f9a11c13c84cbb6f93f51e0fd8a21dc323214366779b724f109ad3b8fb1715edb1709c109176f5"

RPROVIDES:${PN} += "erlang-diameter-src \
erlang27-diameter-src"

RDEPENDS:${PN} += "erlang27-diameter"

inherit rpm
