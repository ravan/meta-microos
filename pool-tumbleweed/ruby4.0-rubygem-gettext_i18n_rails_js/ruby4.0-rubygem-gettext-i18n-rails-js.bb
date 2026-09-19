SUMMARY = "Extends gettext_i18n_rails making your .po files available to client"
DESCRIPTION = "It will find translations inside your .js and .coffee files, then it will \
create JSON versions of your .PO files and will let you serve them with the \
rest of your assets, thus letting you access all your translations offline \
from client side javascript."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "ruby4.0-rubygem-gettext_i18n_rails_js-2.1.0-1.11.aarch64.rpm"
RPM_HASH = "a5beeb0d356abed4aee7537e894c9ea1a3312cdaa4862e8fcfc11ba6968dfbb3fc2a1f44db5dbcc8e9db5fe9ce7c5c7ddf6b2dd573316c6cc7f60aba1f37c9f0"

RPROVIDES:${PN} += "ruby4.0-rubygem-gettext-i18n-rails-js \
rubygem-gettext-i18n-rails-js \
rubygem-ruby-4.0.0-gettext-i18n-rails-js \
rubygem-ruby-4.0.0-gettext-i18n-rails-js-2 \
rubygem-ruby-4.0.0-gettext-i18n-rails-js-2.1 \
rubygem-ruby-4.0.0-gettext-i18n-rails-js-2.1.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-gettext \
rubygem-ruby-4.0.0-gettext-i18n-rails \
rubygem-ruby-4.0.0-po-to-json \
rubygem-ruby-4.0.0-rails"

inherit rpm
