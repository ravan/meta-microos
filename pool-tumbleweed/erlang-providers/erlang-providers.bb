SUMMARY = "An Erlang providers library"
DESCRIPTION = "An Erlang providers library."
LICENSE = "Apache-2.0"

PV = "1.8.1"

RPM_NAME = "erlang-providers-1.8.1-3.8.aarch64.rpm"
RPM_HASH = "8bd9b418ae18731f234efaa63d0042f9fb3e86aa0c36ddf0dbb55f8dacea570aaa62195dab9acdaf9da78a6cf923ab4bf8cb49a0db1fd3ea5f38bb5f77ede4f1"

RPROVIDES:${PN} += "erlang-providers"

RDEPENDS:${PN} += "erlang \
erlang-getopt"

inherit rpm
