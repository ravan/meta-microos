SUMMARY = "Gettext is a pure Ruby libary and tools to localize messages"
DESCRIPTION = "Gettext is a GNU gettext-like program for Ruby. \
The catalog file(po-file) is same format with GNU gettext. \
So you can use GNU gettext tools for maintaining."
LICENSE = "LGPL-3.0-or-later & Ruby"

PV = "3.4.3"

RPM_NAME = "ruby4.0-rubygem-gettext-3.4.3-2.1.aarch64.rpm"
RPM_HASH = "bad6e559cddb05df08923350adfeb5f716c0aa79ce6b048753f057de4ef1a700ebfeb1e4aa180e2b292e4cff515257ed9be2b69ae8bc698eb58620cecec6e66b"

RPROVIDES:${PN} += "ruby4.0-rubygem-gettext \
rubygem-gettext \
rubygem-ruby-4.0.0-gettext \
rubygem-ruby-4.0.0-gettext-3 \
rubygem-ruby-4.0.0-gettext-3.4 \
rubygem-ruby-4.0.0-gettext-3.4.3"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi \
rubygem-ruby-4.0.0-erubi \
rubygem-ruby-4.0.0-locale \
rubygem-ruby-4.0.0-prime \
rubygem-ruby-4.0.0-text"

inherit rpm
