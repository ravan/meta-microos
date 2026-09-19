SUMMARY = "HTML sanitization to Rails applications (part of Rails)"
DESCRIPTION = "HTML sanitization for Rails applications."
LICENSE = "MIT"

PV = "1.7.1"

RPM_NAME = "ruby4.0-rubygem-rails-html-sanitizer-1.7.1-1.1.aarch64.rpm"
RPM_HASH = "b41908e70597aec09b59233a226aa31541a33720f7503b905a25ad9e22d50d1ef0f91e0c8bd7c65f7d016471dc1b07b4f6eefd252921faef492ac24a7776fe6c"

RPROVIDES:${PN} += "ruby4.0-rubygem-rails-html-sanitizer \
rubygem-rails-html-sanitizer \
rubygem-ruby-4.0.0-rails-html-sanitizer \
rubygem-ruby-4.0.0-rails-html-sanitizer-1 \
rubygem-ruby-4.0.0-rails-html-sanitizer-1.7 \
rubygem-ruby-4.0.0-rails-html-sanitizer-1.7.1"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-loofah \
rubygem-ruby-4.0.0-loofah-2 \
rubygem-ruby-4.0.0-nokogiri"

inherit rpm
