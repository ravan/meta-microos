SUMMARY = "Erlang/OTP wx application sources"
DESCRIPTION = "Erlang sources for the wx application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "28.5.0.4"

RPM_NAME = "erlang-wx-src-28.5.0.4-1.1.aarch64.rpm"
RPM_HASH = "1884d29927a89df6bf1de2b494e6d0582cd5801f511f056e4aa70577eee444d0d571d7820cc664c9d7153ceb8edf4e039bb3faae3eb33e2dfbddd7f91360cb52"

RPROVIDES:${PN} += "erlang-wx-src"

RDEPENDS:${PN} += "erlang-wx"

inherit rpm
