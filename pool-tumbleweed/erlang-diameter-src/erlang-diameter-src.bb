SUMMARY = "Erlang/OTP Diameter application sources"
DESCRIPTION = "Erlang sources for the Diameter application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "28.5.0.4"

RPM_NAME = "erlang-diameter-src-28.5.0.4-1.1.aarch64.rpm"
RPM_HASH = "f2def0389269247748bc31f11ef588cace0ca43f80462616bade0e3963da3f3747a22bd39c3c5098855029f2b2e193097df904adae84344e55cfef3b14234871"

RPROVIDES:${PN} += "erlang-diameter-src"

RDEPENDS:${PN} += "erlang-diameter"

inherit rpm
