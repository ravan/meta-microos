SUMMARY = "Erlang documentation"
DESCRIPTION = "Documentation for Erlang."
LICENSE = "Apache-2.0"

PV = "28.5.0.4"

RPM_NAME = "erlang-doc-28.5.0.4-1.1.aarch64.rpm"
RPM_HASH = "6bf1a77dad189be028e0755d87b8c363ffcceb97f70107ecaba047c4de3780c7cd9165cf5bb952296da49be1dcaf1eb4a9f59a908268fb734aa6814ac62f4c8e"

RPROVIDES:${PN} += "erlang-doc"

RDEPENDS:${PN} += "erlang"

inherit rpm
