SUMMARY = "A performance benchmarking library"
DESCRIPTION = "The Benchmark module provides methods for benchmarking Ruby code, giving \
detailed reports on the time taken for each task."
LICENSE = "BSD-2-Clause & Ruby"

PV = "0.4.0"

RPM_NAME = "ruby4.0-rubygem-benchmark-0.4.0-1.8.aarch64.rpm"
RPM_HASH = "0d97d1c1f3b04cb87fbccfc9fade1cd3a7a49ce28ff52ec3fe6a4d0c9bd45abeed6103f29ee2f04000aab7ca3eb0545e21acb129543efa7943c315f2aeffad8c"

RPROVIDES:${PN} += "ruby4.0-rubygem-benchmark \
rubygem-benchmark \
rubygem-ruby-4.0.0-benchmark \
rubygem-ruby-4.0.0-benchmark-0 \
rubygem-ruby-4.0.0-benchmark-0.4 \
rubygem-ruby-4.0.0-benchmark-0.4.0"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/ruby.ruby4.0 \
ruby-abi"

inherit rpm
