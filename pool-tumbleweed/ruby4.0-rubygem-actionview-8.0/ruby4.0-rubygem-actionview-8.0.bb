SUMMARY = "Rendering framework putting the V in MVC (part of Rails)"
DESCRIPTION = "Simple, battle-tested conventions and helpers for building web pages."
LICENSE = "MIT"

PV = "8.0.5"

RPM_NAME = "ruby4.0-rubygem-actionview-8.0-8.0.5-1.2.aarch64.rpm"
RPM_HASH = "4a55dcd73c9bb69ec027726bb649b5819ac851fa878c967c6cfe4f3e5594347e88395bb1492770af88e45440e4decdf62ee43b64093d064282b7f84940cbd3f8"

RPROVIDES:${PN} += "ruby4.0-rubygem-actionview-8.0 \
rubygem-actionview \
rubygem-ruby-4.0.0-actionview \
rubygem-ruby-4.0.0-actionview-8 \
rubygem-ruby-4.0.0-actionview-8.0 \
rubygem-ruby-4.0.0-actionview-8.0.5"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-activesupport \
rubygem-ruby-4.0.0-builder-3 \
rubygem-ruby-4.0.0-erubi-1 \
rubygem-ruby-4.0.0-rails-dom-testing-2 \
rubygem-ruby-4.0.0-rails-html-sanitizer-1"

inherit rpm
