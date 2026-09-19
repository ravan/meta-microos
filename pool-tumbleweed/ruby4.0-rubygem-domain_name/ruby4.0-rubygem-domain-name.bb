SUMMARY = "Domain Name manipulation library for Ruby"
DESCRIPTION = "This is a Domain Name manipulation library for Ruby. \
It can also be used for cookie domain validation based on the Public \
Suffix List."
LICENSE = "BSD-2-Clause & BSD-3-Clause & MPL-2.0"

PV = "0.6.20240107"

RPM_NAME = "ruby4.0-rubygem-domain_name-0.6.20240107-1.11.aarch64.rpm"
RPM_HASH = "ef07016673080bc03d2b2782be5b1f136097dc84e6563dfdd58a865126cc561d2717ae77b7532248de6c5fb9b34543db9cc61d8033c72e07d5b6ca7d4a267566"

RPROVIDES:${PN} += "ruby4.0-rubygem-domain-name \
rubygem-domain-name \
rubygem-ruby-4.0.0-domain-name \
rubygem-ruby-4.0.0-domain-name-0 \
rubygem-ruby-4.0.0-domain-name-0.6 \
rubygem-ruby-4.0.0-domain-name-0.6.20240107"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
ruby-abi"

inherit rpm
