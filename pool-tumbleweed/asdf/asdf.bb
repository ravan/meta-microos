SUMMARY = "Extendable version manager"
DESCRIPTION = "Extendable version manager with support for \
Ruby, Node.js, Elixir, Erlang & more. \
 \
Manage multiple runtime versions with a single CLI tool, \
extendable via plugins."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "asdf-0.20.0-1.2.aarch64.rpm"
RPM_HASH = "086ab52b4767ef6d4c7fb28402d9b9e32c6fca3e21e78a09de87d3d4f511d87d05cf314f0a2115d4881827eac5b26e22b7fa06622f8a1378bc073a6fcf7f9a0e"

RPROVIDES:${PN} += "asdf"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
