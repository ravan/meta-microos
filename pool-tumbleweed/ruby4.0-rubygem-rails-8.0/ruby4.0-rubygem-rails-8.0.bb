SUMMARY = "Full-stack web application framework"
DESCRIPTION = "Ruby on Rails is a full-stack web framework optimized for programmer happiness \
and sustainable productivity. It encourages beautiful code by favoring \
convention over configuration."
LICENSE = "MIT"

PV = "8.0.5"

RPM_NAME = "ruby4.0-rubygem-rails-8.0-8.0.5-1.2.aarch64.rpm"
RPM_HASH = "f76e3eeb5c054817658eae1dc4293e7ab67314009577308b5be1985ce15271c5670345a845c35216e00a9d3f3a7edff7beb58c9021de1fa4eeb697a63e80875f"

RPROVIDES:${PN} += "ruby4.0-rubygem-rails-8.0 \
rubygem-rails \
rubygem-ruby-4.0.0-rails \
rubygem-ruby-4.0.0-rails-8 \
rubygem-ruby-4.0.0-rails-8.0 \
rubygem-ruby-4.0.0-rails-8.0.5"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-actioncable \
rubygem-ruby-4.0.0-actionmailbox \
rubygem-ruby-4.0.0-actionmailer \
rubygem-ruby-4.0.0-actionpack \
rubygem-ruby-4.0.0-actiontext \
rubygem-ruby-4.0.0-actionview \
rubygem-ruby-4.0.0-activejob \
rubygem-ruby-4.0.0-activemodel \
rubygem-ruby-4.0.0-activerecord \
rubygem-ruby-4.0.0-activestorage \
rubygem-ruby-4.0.0-activesupport \
rubygem-ruby-4.0.0-bundler \
rubygem-ruby-4.0.0-railties"

inherit rpm
