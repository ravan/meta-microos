SUMMARY = "Sass adapter for the Rails asset pipeline"
DESCRIPTION = "Sass adapter for the Rails asset pipeline."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "ruby4.0-rubygem-sass-rails-6.0.0-1.31.aarch64.rpm"
RPM_HASH = "92854e86d2f35e53bce172236f0b97ed4686451e43f55f158b7b1df6330cee3b4507a33fc34b2fbb43d6cfa8988b8629758b7270ab88ca010a60880f678a5af3"

RPROVIDES:${PN} += "ruby4.0-rubygem-sass-rails \
rubygem-ruby-4.0.0-sass-rails \
rubygem-ruby-4.0.0-sass-rails-6 \
rubygem-ruby-4.0.0-sass-rails-6.0 \
rubygem-ruby-4.0.0-sass-rails-6.0.0 \
rubygem-sass-rails"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-sassc-rails \
rubygem-ruby-4.0.0-sassc-rails-2"

inherit rpm
