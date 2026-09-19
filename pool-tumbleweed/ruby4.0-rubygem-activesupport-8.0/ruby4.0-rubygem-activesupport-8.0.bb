SUMMARY = "A toolkit of support libraries and Ruby core extensions extracted"
DESCRIPTION = "A toolkit of support libraries and Ruby core extensions extracted from the \
Rails framework. Rich support for multibyte strings, internationalization, \
time zones, and testing."
LICENSE = "MIT"

PV = "8.0.5"

RPM_NAME = "ruby4.0-rubygem-activesupport-8.0-8.0.5-1.2.aarch64.rpm"
RPM_HASH = "6d5b54701762d15518369bbacd00901858e2c57dbb42dc52f66588dcd503063b197b4a55e9bda47090370c35b533a9da84a56acc5b9247c0405b920955e44e13"

RPROVIDES:${PN} += "ruby4.0-rubygem-activesupport-8.0 \
rubygem-activesupport \
rubygem-ruby-4.0.0-activesupport \
rubygem-ruby-4.0.0-activesupport-8 \
rubygem-ruby-4.0.0-activesupport-8.0 \
rubygem-ruby-4.0.0-activesupport-8.0.5"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-base64 \
rubygem-ruby-4.0.0-benchmark \
rubygem-ruby-4.0.0-bigdecimal \
rubygem-ruby-4.0.0-concurrent-ruby \
rubygem-ruby-4.0.0-concurrent-ruby-1 \
rubygem-ruby-4.0.0-connection-pool \
rubygem-ruby-4.0.0-drb \
rubygem-ruby-4.0.0-i18n \
rubygem-ruby-4.0.0-logger \
rubygem-ruby-4.0.0-minitest \
rubygem-ruby-4.0.0-securerandom \
rubygem-ruby-4.0.0-tzinfo \
rubygem-ruby-4.0.0-tzinfo-2 \
rubygem-ruby-4.0.0-uri"

inherit rpm
