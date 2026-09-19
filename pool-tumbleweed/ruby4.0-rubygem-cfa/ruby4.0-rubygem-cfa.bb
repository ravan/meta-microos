SUMMARY = "CFA (Config Files API) provides an easy way to create models on top"
DESCRIPTION = "Library offering separation of parsing and file access from the rest of the \
logic for managing configuraton files. It has built-in support for parsing \
using augeas lenses and also for working with files directly in memory."
LICENSE = "LGPL-3.0-only"

PV = "1.0.2"

RPM_NAME = "ruby4.0-rubygem-cfa-1.0.2-1.31.aarch64.rpm"
RPM_HASH = "cdc8380842a9d37b6fd3e1d2949b1a29263ab2e35b62223f326a65f768e2c5bd2a146027cdeaa2825d941565758af4706d23cd5d481da27c6560d830334f37af"

RPROVIDES:${PN} += "ruby4.0-rubygem-cfa \
rubygem-cfa \
rubygem-ruby-4.0.0-cfa \
rubygem-ruby-4.0.0-cfa-1 \
rubygem-ruby-4.0.0-cfa-1.0 \
rubygem-ruby-4.0.0-cfa-1.0.2"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-ruby-augeas"

inherit rpm
