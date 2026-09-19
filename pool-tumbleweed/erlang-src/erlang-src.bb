SUMMARY = "Erlang/OTP applications sources"
DESCRIPTION = "Erlang sources for all the applications in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "28.5.0.4"

RPM_NAME = "erlang-src-28.5.0.4-1.1.aarch64.rpm"
RPM_HASH = "38e4413a0e74e51f48ea88bf1c2a4f7eedc461002414ca2b1088671bd300b8c9021b948557c1c088b2e27db45f83a7df364fc61ed2e5c7f29c90dd4f28053f1b"

RPROVIDES:${PN} += "erlang-src"

RDEPENDS:${PN} += "erlang"

inherit rpm
