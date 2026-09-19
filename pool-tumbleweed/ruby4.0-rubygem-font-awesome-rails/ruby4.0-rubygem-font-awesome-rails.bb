SUMMARY = "an asset gemification of the font-awesome icon font library"
DESCRIPTION = "font-awesome-rails provides the Font-Awesome web fonts and stylesheets as a \
Rails engine for use with the asset pipeline."
LICENSE = "MIT & OFL-1.1"

PV = "4.7.0.9"

RPM_NAME = "ruby4.0-rubygem-font-awesome-rails-4.7.0.9-1.8.aarch64.rpm"
RPM_HASH = "8ac39f7b0ba23dfef59344292573bf9e87ca0aaaea6a9c5b7a1f37edae3dc07e4493bfaed0391b008501c3cd760fcd93c4e0ff5666166f50ead08fbdcb2d2b27"

RPROVIDES:${PN} += "ruby4.0-rubygem-font-awesome-rails \
rubygem-font-awesome-rails \
rubygem-ruby-4.0.0-font-awesome-rails \
rubygem-ruby-4.0.0-font-awesome-rails-4 \
rubygem-ruby-4.0.0-font-awesome-rails-4.7 \
rubygem-ruby-4.0.0-font-awesome-rails-4.7.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-railties"

inherit rpm
