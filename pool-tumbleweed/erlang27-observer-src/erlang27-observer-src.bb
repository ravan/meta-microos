SUMMARY = "Erlang/OTP observer application sources"
DESCRIPTION = "Erlang sources for the observer application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating embedded systems."
LICENSE = "Apache-2.0"

PV = "27.1.3"

RPM_NAME = "erlang27-observer-src-27.1.3-3.1.aarch64.rpm"
RPM_HASH = "16073fa226b7058329fc5e0ec812aaa8afe3b657fd64eb25d3ec2bdaf38fb78200b6939fd8f60cd1d82533c7aa4f4c6605759aee6ecc48d5823744e942520081"

RPROVIDES:${PN} += "erlang-observer-src \
erlang27-observer-src"

RDEPENDS:${PN} += "erlang27-observer"

inherit rpm
