SUMMARY = "Colorize printed text on ANSI terminals"
DESCRIPTION = "Colorize printed text on ANSI terminals."
LICENSE = "MIT"

PV = "3.1.1"

RPM_NAME = "ruby4.0-rubygem-rainbow-3.1.1-1.23.aarch64.rpm"
RPM_HASH = "d8111f5ca3f871ed94fb35c9ec3ce79a7854e3b9d548ca4bfd8d9728cdeb09863c31ee84ff0f18c3499b36eb8b977cb68ebc670a9d57f76aa1f6ba01a97c3998"

RPROVIDES:${PN} += "ruby4.0-rubygem-rainbow \
rubygem-rainbow \
rubygem-ruby-4.0.0-rainbow \
rubygem-ruby-4.0.0-rainbow-3 \
rubygem-ruby-4.0.0-rainbow-3.1 \
rubygem-ruby-4.0.0-rainbow-3.1.1"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
