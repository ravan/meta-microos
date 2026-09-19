SUMMARY = "Erlang/OTP reltool application sources"
DESCRIPTION = "Erlang sources for the reltool application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "28.5.0.4"

RPM_NAME = "erlang-reltool-src-28.5.0.4-1.1.aarch64.rpm"
RPM_HASH = "7c55703eb5e9d4a39de0bcf0602829f17912f597b3fc331abc83f5e876dab8a30b8f1b21f703b42862db05e1da9828d5fcaf11805882170f294702d9158e8485"

RPROVIDES:${PN} += "erlang-reltool-src"

RDEPENDS:${PN} += "erlang-reltool"

inherit rpm
