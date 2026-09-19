SUMMARY = "Collection of scripts and macros for ruby packaging"
DESCRIPTION = "This package is needed for (generated) ruby gems. It provides hooks for \
automatic rpm provides and requires and macros that gem2rpm uses."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "ruby-common-4.0.0-4.2.noarch.rpm"
RPM_HASH = "0f027571db1d71ad8591ae77eaad3311f326d4d966c5da9c5168c238917a8ec573d307eca0a548320eaba94dc6863f0541d7171db18854993b31303ef3a7ce56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-ruby-common \
rpm-macro-gem-base \
rpm-macro-gem-build \
rpm-macro-gem-cleanup \
rpm-macro-gem-doc-ext \
rpm-macro-gem-extensions \
rpm-macro-gem-install \
rpm-macro-gem-packages \
rpm-macro-gem-platform \
rpm-macro-gem-unpack \
rpm-macro-rb-arch \
rpm-macro-rb-archdir \
rpm-macro-rb-binary \
rpm-macro-rb-dir \
rpm-macro-rb-libdir \
rpm-macro-rb-sitearch \
rpm-macro-rb-sitearchdir \
rpm-macro-rb-sitedir \
rpm-macro-rb-sitelib \
rpm-macro-rb-sitelibdir \
rpm-macro-rb-vendorarch \
rpm-macro-rb-vendorarchdir \
rpm-macro-rb-vendordir \
rpm-macro-rb-vendorlib \
rpm-macro-rb-vendorlibdir \
rpm-macro-rb-ver \
rpm-macro-requires-on-provides-eq \
rpm-macro-requires-on-provides-ge \
rpm-macro-ruby \
rpm-macro-ruby-fix-shebang \
rpm-macro-ruby-fix-shebang-path \
rpm-macro-rubySTOP \
rpm-macro-rubydevel \
rpm-macro-rubydevelSTOP \
rpm-macro-rubydevelxSTOP \
rpm-macro-rubygem \
rpm-macro-rubygems-requires \
rpm-macro-rubygemsSTOP \
rpm-macro-rubygemsxSTOP \
rpm-macro-rubygemsxxSTOP \
rpm-macro-rubyxSTOP \
rpm-macro-set-gem-binary \
ruby-common \
ruby-macros"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/getopt \
/usr/bin/sh \
fdupes \
rubygem-gem2rpm \
util-linux"

inherit rpm
