SUMMARY = "Rails packaging support"
DESCRIPTION = "This package is needed for (generated) ruby gems. It provides hooks for \
automatic rpm provides and requires and macros that gem2rpm uses. \
 \
Rails packaging support files."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "ruby-common-rails-4.0.0-4.2.noarch.rpm"
RPM_HASH = "f2987af601f739e5c1b117cb5c693c993791ce8649864adff524a4dfd013067005673a4c3c73a1a3a403a47b46c1a485da1d65facd71a9a57336707b03947aae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm-macro-rails-fix-ruby-shebang \
rpm-macro-rails-fix-ruby-suffix \
rpm-macro-rails-regen-gemfile-lock \
rpm-macro-rails-save-gemfile \
rpm-macro-rails-write-appinfo \
rpm-macro-ruby-fix-shebang \
ruby-common-rails"

RDEPENDS:${PN} += "/usr/bin/sh \
ruby-common \
rubygem-bundler"

inherit rpm
