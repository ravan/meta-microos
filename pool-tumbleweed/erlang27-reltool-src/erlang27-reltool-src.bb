SUMMARY = "Erlang/OTP reltool application sources"
DESCRIPTION = "Erlang sources for the reltool application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "27.1.3"

RPM_NAME = "erlang27-reltool-src-27.1.3-3.1.aarch64.rpm"
RPM_HASH = "97d19fc91e20e13a08a8cbb36f8d7914bdaa602b3919573f3a6adcaa481dfb1e77177021d517405e4e1247b20d2c57af36c1d7e09c6ca6deb768b20f8182eeea"

RPROVIDES:${PN} += "erlang-reltool-src \
erlang27-reltool-src"

RDEPENDS:${PN} += "erlang27-reltool"

inherit rpm
