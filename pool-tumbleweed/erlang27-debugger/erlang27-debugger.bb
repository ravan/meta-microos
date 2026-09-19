SUMMARY = "A debugger for debugging and testing of Erlang programs"
DESCRIPTION = "A debugger for debugging and testing of Erlang programs."
LICENSE = "Apache-2.0"

PV = "27.1.3"

RPM_NAME = "erlang27-debugger-27.1.3-3.1.aarch64.rpm"
RPM_HASH = "3427ec8f2b98e410dfb23b738d92d141ac1e08e03bb07f71f2338f6c609ddf2aee21c88b013952ea1614982cb929b2c7f5a73162daa6b70e122c6f8f8e87f4b6"

RPROVIDES:${PN} += "erlang-debugger \
erlang27-debugger"

RDEPENDS:${PN} += "erlang27 \
erlang27-wx"

inherit rpm
