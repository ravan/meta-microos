SUMMARY = "Erlang/OTP debugger application sources"
DESCRIPTION = "Erlang sources for the debugger application in the Erlang/OTP system. \
They are useful for educational purpose and as a base for creating \
embedded systems."
LICENSE = "Apache-2.0"

PV = "27.1.3"

RPM_NAME = "erlang27-debugger-src-27.1.3-3.1.aarch64.rpm"
RPM_HASH = "b21263d4e546f343234ea0e1d3df10dd273aaf544e2cb434ad3f23616d3b97292349b7f21f6ca30fba47f261bf9566e35dc39938f131b5913a2c41c8a92156fa"

RPROVIDES:${PN} += "erlang-debugger-src \
erlang27-debugger-src"

RDEPENDS:${PN} += "erlang27-debugger"

inherit rpm
