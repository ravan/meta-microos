SUMMARY = "Erlang/OTP et application sources"
DESCRIPTION = "Erlang sources for the et application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "27.1.3"

RPM_NAME = "erlang27-et-src-27.1.3-3.1.aarch64.rpm"
RPM_HASH = "942399428cef1a018faf015c7f9afe4507f7867a08a6ee8ccad2ef25badcbb7b2a39cdbaa6160399cbac1b0ee9d88e41ceea85221396f3dbf86aa4401ba1ce27"

RPROVIDES:${PN} += "erlang-et-src \
erlang27-et-src"

RDEPENDS:${PN} += "erlang27-et"

inherit rpm
