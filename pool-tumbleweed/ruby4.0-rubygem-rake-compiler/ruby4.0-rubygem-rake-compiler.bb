SUMMARY = "Rake-based Ruby Extension (C, Java) task generator"
DESCRIPTION = "Provide a standard and simplified way to build and package \
Ruby extensions (C, Java) using Rake as glue."
LICENSE = "MIT"

PV = "1.2.8"

RPM_NAME = "ruby4.0-rubygem-rake-compiler-1.2.8-1.11.aarch64.rpm"
RPM_HASH = "1268c6e4e145f4dd223a31d46e159ae6618578bfc9d79d9d044ba5eba3a9c0661cf7589e55a53bd52a192acf81791afd02a8f457690ee251f82dcc3216813667"

RPROVIDES:${PN} += "ruby4.0-rubygem-rake-compiler \
rubygem-rake-compiler \
rubygem-ruby-4.0.0-rake-compiler \
rubygem-ruby-4.0.0-rake-compiler-1 \
rubygem-ruby-4.0.0-rake-compiler-1.2 \
rubygem-ruby-4.0.0-rake-compiler-1.2.8"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi \
rubygem-ruby-4.0.0-rake"

inherit rpm
