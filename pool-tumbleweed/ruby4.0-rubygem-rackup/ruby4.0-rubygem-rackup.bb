SUMMARY = "A general server command for Rack applications"
DESCRIPTION = "A general server command for Rack applications."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "ruby4.0-rubygem-rackup-2.2.1-1.11.aarch64.rpm"
RPM_HASH = "9c71bc3492bbbbaee75e207823f98d5b77c29f9b763d80c1ddfde82c3db40aba92e6f2304244a4e00779e76bef5736c0155b81cd932e564630ba8c8926aa8446"

RPROVIDES:${PN} += "ruby4.0-rubygem-rackup \
rubygem-rackup \
rubygem-ruby-4.0.0-rackup \
rubygem-ruby-4.0.0-rackup-2 \
rubygem-ruby-4.0.0-rackup-2.2 \
rubygem-ruby-4.0.0-rackup-2.2.1"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi \
rubygem-ruby-4.0.0-rack"

inherit rpm
