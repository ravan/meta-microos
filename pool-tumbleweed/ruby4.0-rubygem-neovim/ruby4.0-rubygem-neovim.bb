SUMMARY = "A Ruby client for Neovim"
DESCRIPTION = "A Ruby client for Neovim."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "ruby4.0-rubygem-neovim-0.10.0-1.8.aarch64.rpm"
RPM_HASH = "b4b381e03c9f34909ffdfb4f0a4c99679ba4d425c6bf7cffadb7835736a5528a0579f156d3855e2862077caa35cc9a97dec8d791911c449831c403451b60759e"

RPROVIDES:${PN} += "ruby4.0-rubygem-neovim \
rubygem-neovim \
rubygem-ruby-4.0.0-neovim \
rubygem-ruby-4.0.0-neovim-0 \
rubygem-ruby-4.0.0-neovim-0.10 \
rubygem-ruby-4.0.0-neovim-0.10.0"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi \
rubygem-ruby-4.0.0-msgpack-1 \
rubygem-ruby-4.0.0-multi-json-1"

inherit rpm
