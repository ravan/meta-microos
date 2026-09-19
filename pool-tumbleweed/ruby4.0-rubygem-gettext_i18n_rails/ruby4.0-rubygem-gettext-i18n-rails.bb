SUMMARY = "Simple FastGettext Rails integration"
DESCRIPTION = "Simple FastGettext Rails integration."
LICENSE = "MIT"

PV = "1.13.0"

RPM_NAME = "ruby4.0-rubygem-gettext_i18n_rails-1.13.0-1.10.aarch64.rpm"
RPM_HASH = "7af9ecc6dffc31634dbe51f912d0ed2c97a6b7c1e1a05a9086a3ef7974e97a6de6660b9ce5956db67602676d608f0e1aa100d802df0f6e740ae9bbff68e28b8a"

RPROVIDES:${PN} += "ruby4.0-rubygem-gettext-i18n-rails \
rubygem-gettext-i18n-rails \
rubygem-ruby-4.0.0-gettext-i18n-rails \
rubygem-ruby-4.0.0-gettext-i18n-rails-1 \
rubygem-ruby-4.0.0-gettext-i18n-rails-1.13 \
rubygem-ruby-4.0.0-gettext-i18n-rails-1.13.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-fast-gettext"

inherit rpm
