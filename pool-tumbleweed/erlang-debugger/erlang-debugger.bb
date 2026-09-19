SUMMARY = "A debugger for debugging and testing of Erlang programs"
DESCRIPTION = "A debugger for debugging and testing of Erlang programs."
LICENSE = "Apache-2.0"

PV = "28.5.0.4"

RPM_NAME = "erlang-debugger-28.5.0.4-1.1.aarch64.rpm"
RPM_HASH = "8f42f6e535d774e2aadb50d98fbdfd2001a19a39e5a5737416b54ae0d22e3d683e64b9ca291f5968c5aad53bb8a68038fe36640a515826976abf9117e98220de"

RPROVIDES:${PN} += "erlang-debugger"

RDEPENDS:${PN} += "erlang \
erlang-wx"

inherit rpm
