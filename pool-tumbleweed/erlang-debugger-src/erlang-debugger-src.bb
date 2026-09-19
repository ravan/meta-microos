SUMMARY = "Erlang/OTP debugger application sources"
DESCRIPTION = "Erlang sources for the debugger application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "28.5.0.4"

RPM_NAME = "erlang-debugger-src-28.5.0.4-1.1.aarch64.rpm"
RPM_HASH = "2eeee785a1952712f3829f57b8b1fe73c72ca2871282bbf79aebd9d471870ca13a2681843a140437e4e6b3048e9d3db0b9a470aa31b352cdc5f480a786c554cb"

RPROVIDES:${PN} += "erlang-debugger-src"

RDEPENDS:${PN} += "erlang-debugger"

inherit rpm
