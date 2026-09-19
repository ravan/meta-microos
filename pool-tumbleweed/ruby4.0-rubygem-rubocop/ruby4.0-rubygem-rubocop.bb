SUMMARY = "Automatic Ruby code style checking tool"
DESCRIPTION = "RuboCop is a Ruby code style checking and code formatting tool. \
It aims to enforce the community-driven Ruby Style Guide."
LICENSE = "MIT"

PV = "1.75.2"

RPM_NAME = "ruby4.0-rubygem-rubocop-1.75.2-1.7.aarch64.rpm"
RPM_HASH = "820a9ec371dd4e79b5a385a3877d19b8bfcb42c841fbcc1acfeaa2af860190915703339c8fcc58186c50dddac7155eee0edf16580a501c68a7796e70c5c08a4e"

RPROVIDES:${PN} += "ruby4.0-rubygem-rubocop \
rubygem-rubocop \
rubygem-ruby-4.0.0-rubocop \
rubygem-ruby-4.0.0-rubocop-1 \
rubygem-ruby-4.0.0-rubocop-1.75 \
rubygem-ruby-4.0.0-rubocop-1.75.2"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi \
rubygem-ruby-4.0.0-json-2 \
rubygem-ruby-4.0.0-language-server-protocol-3.17.0 \
rubygem-ruby-4.0.0-lint-roller-1.1 \
rubygem-ruby-4.0.0-parallel-1 \
rubygem-ruby-4.0.0-parser \
rubygem-ruby-4.0.0-rainbow \
rubygem-ruby-4.0.0-regexp-parser \
rubygem-ruby-4.0.0-rubocop-ast \
rubygem-ruby-4.0.0-ruby-progressbar-1 \
rubygem-ruby-4.0.0-unicode-display-width"

inherit rpm
