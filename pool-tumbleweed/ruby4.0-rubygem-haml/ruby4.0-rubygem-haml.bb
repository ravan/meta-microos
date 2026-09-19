SUMMARY = "An elegant, structured (X)HTML/XML templating engine"
DESCRIPTION = "An elegant, structured (X)HTML/XML templating engine."
LICENSE = "MIT"

PV = "6.3.0"

RPM_NAME = "ruby4.0-rubygem-haml-6.3.0-1.12.aarch64.rpm"
RPM_HASH = "bb3f513c33b9e71433fc6b2ae371a2c2067603ab6693032f78dda7b1b3ddf2542bc36b2b188ab95a545f704d4542310aeb2b9f8cacda79a72ecc9848e5bec079"

RPROVIDES:${PN} += "ruby4.0-rubygem-haml \
rubygem-haml \
rubygem-ruby-4.0.0-haml \
rubygem-ruby-4.0.0-haml-6 \
rubygem-ruby-4.0.0-haml-6.3 \
rubygem-ruby-4.0.0-haml-6.3.0"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi \
rubygem-ruby-4.0.0-temple \
rubygem-ruby-4.0.0-thor \
rubygem-ruby-4.0.0-tilt"

inherit rpm
