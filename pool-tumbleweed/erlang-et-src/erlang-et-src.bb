SUMMARY = "Erlang/OTP et application sources"
DESCRIPTION = "Erlang sources for the et application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "28.5.0.4"

RPM_NAME = "erlang-et-src-28.5.0.4-1.1.aarch64.rpm"
RPM_HASH = "4330a068381b104caffc41816f295446c1d47f3f3149211ed901634ca3953916d94e79d48390a1c6272db4cb262ef16c067d25bd8793bd42aaaab851e18b105b"

RPROVIDES:${PN} += "erlang-et-src"

RDEPENDS:${PN} += "erlang-et"

inherit rpm
