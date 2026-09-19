SUMMARY = "Ruby module for reading and writing zip files"
DESCRIPTION = "rubyzip is a ruby module for reading and writing zip files."
LICENSE = "BSD-2-Clause"

PV = "2.3.2"

RPM_NAME = "ruby4.0-rubygem-rubyzip-2.3.2-1.25.aarch64.rpm"
RPM_HASH = "e983f3700ff0dd295bc430dead3a4e2ea9b68888c4e958eb98b76fefc532a732ba63668bf4327ef8ad3dc3e7adb9dc05590852411f38d00d03d5aac1e267a2d3"

RPROVIDES:${PN} += "ruby4.0-rubygem-rubyzip \
rubygem-ruby-4.0.0-rubyzip \
rubygem-ruby-4.0.0-rubyzip-2 \
rubygem-ruby-4.0.0-rubyzip-2.3 \
rubygem-ruby-4.0.0-rubyzip-2.3.2 \
rubygem-rubyzip"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
ruby-abi"

inherit rpm
