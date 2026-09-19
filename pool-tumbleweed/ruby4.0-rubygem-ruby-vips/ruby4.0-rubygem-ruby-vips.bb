SUMMARY = "A fast image processing library with low memory needs"
DESCRIPTION = "ruby-vips is a binding for the libvips image processing library. It is fast \
and it can process large images without loading the whole image in memory."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ruby4.0-rubygem-ruby-vips-2.3.0-1.2.aarch64.rpm"
RPM_HASH = "4b23bafa9a286201cce926d563082f2a53379028673eb6b03d6de8caf876c218188ead39f73dce245108192417ffbeb418a1a7305f418232fdfe2a501241b272"

RPROVIDES:${PN} += "ruby4.0-rubygem-ruby-vips \
rubygem-ruby-4.0.0-ruby-vips \
rubygem-ruby-4.0.0-ruby-vips-2 \
rubygem-ruby-4.0.0-ruby-vips-2.3 \
rubygem-ruby-4.0.0-ruby-vips-2.3.0 \
rubygem-ruby-vips"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
libvips42 \
ruby-abi \
rubygem-ruby-4.0.0-ffi-1 \
rubygem-ruby-4.0.0-logger"

inherit rpm
