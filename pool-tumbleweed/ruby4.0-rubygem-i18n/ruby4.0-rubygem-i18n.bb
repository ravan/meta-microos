SUMMARY = "New wave Internationalization support for Ruby"
DESCRIPTION = "New wave Internationalization support for Ruby."
LICENSE = "MIT"

PV = "1.14.7"

RPM_NAME = "ruby4.0-rubygem-i18n-1.14.7-1.8.aarch64.rpm"
RPM_HASH = "32d63052161f84096adffb53b64d49192572a2546809d8c53651615f971388c1a0d8de0be42435a20299f8ebebf4adcd9056987a07d97741af23904aec9aba6d"

RPROVIDES:${PN} += "ruby4.0-rubygem-i18n \
rubygem-i18n \
rubygem-ruby-4.0.0-i18n \
rubygem-ruby-4.0.0-i18n-1 \
rubygem-ruby-4.0.0-i18n-1.14 \
rubygem-ruby-4.0.0-i18n-1.14.7"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-concurrent-ruby-1"

inherit rpm
