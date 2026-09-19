SUMMARY = "Erlang/OTP wx application sources"
DESCRIPTION = "Erlang sources for the wx application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "27.1.3"

RPM_NAME = "erlang27-wx-src-27.1.3-3.1.aarch64.rpm"
RPM_HASH = "f7bfa0096e46ad2ab5d405310b71a6a17972ae51717bad717a4bf40333f2c812a5c85ca6ed18d524e6149fbc399e61912270c185548834ee63c58fc1ba723418"

RPROVIDES:${PN} += "erlang-wx-src \
erlang27-wx-src"

RDEPENDS:${PN} += "erlang27-wx"

inherit rpm
