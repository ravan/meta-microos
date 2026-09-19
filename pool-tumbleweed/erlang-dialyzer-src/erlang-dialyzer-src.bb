SUMMARY = "Erlang/OTP dialyzer application sources"
DESCRIPTION = "Erlang sources for the dialyzer application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "28.5.0.4"

RPM_NAME = "erlang-dialyzer-src-28.5.0.4-1.1.aarch64.rpm"
RPM_HASH = "59c70a8949558398a6647d265a0b046f97ffd4e6155adbe4508a1b1be121352513e09c0807123612761559b283254d2ec86f3b6d3811e2a0b6f5c02b324f9749"

RPROVIDES:${PN} += "erlang-dialyzer-src"

RDEPENDS:${PN} += "erlang-dialyzer"

inherit rpm
