SUMMARY = "A powerful but elegant CSS compiler that makes CSS fun again"
DESCRIPTION = "Ruby Sass is deprecated! See https://sass-lang.com/ruby-sass for \
details. \
Sass makes CSS fun again. Sass is an extension of CSS, adding \
nested rules, variables, mixins, selector inheritance, and more. \
It's translated to well-formatted, standard CSS using the \
command line tool or a web-framework plugin."
LICENSE = "MIT"

PV = "3.7.4"

RPM_NAME = "ruby4.0-rubygem-sass-3.7.4-2.12.aarch64.rpm"
RPM_HASH = "f150f497c11752260db708779fd769669965c19d93e2b74a6cf7ab8e37e02d54b97b2fecd4d94b9a6cb5b020ba9f9fa17ecbf790b24cf6bbc5a400722a45b4df"

RPROVIDES:${PN} += "ruby4.0-rubygem-sass \
rubygem-ruby-4.0.0-sass \
rubygem-ruby-4.0.0-sass-3 \
rubygem-ruby-4.0.0-sass-3.7 \
rubygem-ruby-4.0.0-sass-3.7.4 \
rubygem-sass"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi \
rubygem-ruby-4.0.0-sass-listen-4.0"

inherit rpm
