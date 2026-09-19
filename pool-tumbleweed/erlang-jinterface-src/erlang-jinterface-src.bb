SUMMARY = "Erlang/OTP jinterface application sources"
DESCRIPTION = "Erlang sources for the jinterface application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "28.5.0.4"

RPM_NAME = "erlang-jinterface-src-28.5.0.4-1.1.aarch64.rpm"
RPM_HASH = "9a4c4d23788cf0c84b097849ec0aee7dfec9b10c5d97a6df23baf46010b9998e9faede980669201f4a96084aac33a3852233d9584cc36dcd0b69c961ab75f7be"

RPROVIDES:${PN} += "erlang-jinterface-src"

RDEPENDS:${PN} += "erlang-jinterface"

inherit rpm
