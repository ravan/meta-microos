SUMMARY = "Web-flow and rendering framework putting the VC in MVC (part of"
DESCRIPTION = "Web apps on Rails. Simple, battle-tested conventions for building and testing \
MVC web applications. Works with any Rack-compatible server."
LICENSE = "MIT"

PV = "8.0.5"

RPM_NAME = "ruby4.0-rubygem-actionpack-8.0-8.0.5-1.2.aarch64.rpm"
RPM_HASH = "8ef9409d269de9177ef31a7d35d9d07adcd93117be06aa90d124e41cef00ae38e0203478a50207c1977db842c1c0a7eaf4b13fa4aeb010b6fff54a05a6c51ece"

RPROVIDES:${PN} += "ruby4.0-rubygem-actionpack-8.0 \
rubygem-actionpack \
rubygem-ruby-4.0.0-actionpack \
rubygem-ruby-4.0.0-actionpack-8 \
rubygem-ruby-4.0.0-actionpack-8.0 \
rubygem-ruby-4.0.0-actionpack-8.0.5"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-actionview \
rubygem-ruby-4.0.0-activesupport \
rubygem-ruby-4.0.0-nokogiri \
rubygem-ruby-4.0.0-rack \
rubygem-ruby-4.0.0-rack-session \
rubygem-ruby-4.0.0-rack-test \
rubygem-ruby-4.0.0-rails-dom-testing-2 \
rubygem-ruby-4.0.0-rails-html-sanitizer-1 \
rubygem-ruby-4.0.0-useragent-0"

inherit rpm
