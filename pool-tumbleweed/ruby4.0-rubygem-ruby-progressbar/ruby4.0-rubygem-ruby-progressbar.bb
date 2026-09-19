SUMMARY = "Ruby/ProgressBar is a flexible text progress bar library for Ruby"
DESCRIPTION = "Ruby/ProgressBar is an extremely flexible text progress bar library for Ruby. \
The output can be customized with a flexible formatting system including: \
percentage, bars of various formats, elapsed time and estimated time \
remaining."
LICENSE = "MIT"

PV = "1.13.0"

RPM_NAME = "ruby4.0-rubygem-ruby-progressbar-1.13.0-1.15.aarch64.rpm"
RPM_HASH = "97c489408c5aa95b2833dfdbdbed57a41b9234d9e9294c7ea94147b472fc366280a769eb60a00474afe5bed71e1f9307c16391e539d5763459cfe59ff76212e6"

RPROVIDES:${PN} += "ruby4.0-rubygem-ruby-progressbar \
rubygem-ruby-4.0.0-ruby-progressbar \
rubygem-ruby-4.0.0-ruby-progressbar-1 \
rubygem-ruby-4.0.0-ruby-progressbar-1.13 \
rubygem-ruby-4.0.0-ruby-progressbar-1.13.0 \
rubygem-ruby-progressbar"

RDEPENDS:${PN} += "/usr/bin/env \
ruby-abi"

inherit rpm
