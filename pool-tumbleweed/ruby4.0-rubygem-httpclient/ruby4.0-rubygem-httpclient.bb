SUMMARY = "gives something like the functionality of libwww-perl (LWP) in Ruby"
DESCRIPTION = "gives something like the functionality of libwww-perl (LWP) in Ruby."
LICENSE = "Ruby"

PV = "2.8.3"

RPM_NAME = "ruby4.0-rubygem-httpclient-2.8.3-1.46.aarch64.rpm"
RPM_HASH = "0b1543da2790457b0ccc817d4950f991e86cc965789b8543b3bf73ceb92a1ebc72c67b7170859bc1819aeb28f8ea67683f34ffe04b9d9a2e2797f2923d63792d"

RPROVIDES:${PN} += "ruby4.0-rubygem-httpclient \
rubygem-httpclient \
rubygem-ruby-4.0.0-httpclient \
rubygem-ruby-4.0.0-httpclient-2 \
rubygem-ruby-4.0.0-httpclient-2.8 \
rubygem-ruby-4.0.0-httpclient-2.8.3"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
alts \
ruby-abi"

inherit rpm
