SUMMARY = "Sass adapter for the Rails asset pipeline"
DESCRIPTION = "Sass adapter for the Rails asset pipeline."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "ruby4.0-rubygem-sass-rails-5.1-5.1.0-1.31.aarch64.rpm"
RPM_HASH = "0d1e51bc50d1ca43806eedce06bf4fdde00c71a52fd0974cb8ad280805f253fe92a09ef1f154f96b93621b5230f24d80714c81c908d1b133f97d06b9e1ff3d00"

RPROVIDES:${PN} += "ruby4.0-rubygem-sass-rails-5.1 \
rubygem-ruby-4.0.0-sass-rails \
rubygem-ruby-4.0.0-sass-rails-5 \
rubygem-ruby-4.0.0-sass-rails-5.1 \
rubygem-ruby-4.0.0-sass-rails-5.1.0 \
rubygem-sass-rails"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-railties \
rubygem-ruby-4.0.0-sass-3 \
rubygem-ruby-4.0.0-sprockets \
rubygem-ruby-4.0.0-sprockets-rails \
rubygem-ruby-4.0.0-tilt"

inherit rpm
