SUMMARY = "Parse CSS and add vendor prefixes to CSS rules using values from the"
DESCRIPTION = "Parse CSS and add vendor prefixes to CSS rules using values from the Can I Use \
website."
LICENSE = "MIT"

PV = "10.4.19.0"

RPM_NAME = "ruby4.0-rubygem-autoprefixer-rails-10.4.19.0-1.11.aarch64.rpm"
RPM_HASH = "2b83e0428ae4a10b1f795ff8ae9172ab2c68561317fa8793f4b48def0085b0448f905aff1b9e2ed9496e34a210ccde12e5ae817022e387260f5dac4216c6b245"

RPROVIDES:${PN} += "ruby4.0-rubygem-autoprefixer-rails \
rubygem-autoprefixer-rails \
rubygem-ruby-4.0.0-autoprefixer-rails \
rubygem-ruby-4.0.0-autoprefixer-rails-10 \
rubygem-ruby-4.0.0-autoprefixer-rails-10.4 \
rubygem-ruby-4.0.0-autoprefixer-rails-10.4.19"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-execjs"

inherit rpm
