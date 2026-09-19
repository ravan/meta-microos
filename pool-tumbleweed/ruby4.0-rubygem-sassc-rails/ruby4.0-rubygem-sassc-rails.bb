SUMMARY = "Integrate SassC-Ruby into Rails"
DESCRIPTION = "We all love working with Sass, but compilation can take quite a long time for larger codebases. This gem integrates the C implementation of Sass, LibSass, into the asset pipeline."
LICENSE = "MIT"

PV = "2.1.2"

RPM_NAME = "ruby4.0-rubygem-sassc-rails-2.1.2-1.31.aarch64.rpm"
RPM_HASH = "e3328ee18964873669e23477a53ae6e57b64c7887f17ae32305ea20511111cb36fc11c5c1529a511b5aae5af98a036c62c27ccf2d512a2fe3c686bacfb00c15e"

RPROVIDES:${PN} += "ruby4.0-rubygem-sassc-rails \
rubygem-ruby-4.0.0-sassc-rails \
rubygem-ruby-4.0.0-sassc-rails-2 \
rubygem-ruby-4.0.0-sassc-rails-2.1 \
rubygem-ruby-4.0.0-sassc-rails-2.1.2 \
rubygem-sassc-rails"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-railties \
rubygem-ruby-4.0.0-sassc \
rubygem-ruby-4.0.0-sprockets \
rubygem-ruby-4.0.0-sprockets-rails \
rubygem-ruby-4.0.0-tilt"

inherit rpm
