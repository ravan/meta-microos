SUMMARY = "speed, persistence, http(s)"
DESCRIPTION = "EXtended http(s) CONnections."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "ruby4.0-rubygem-excon-1.1.1-1.10.aarch64.rpm"
RPM_HASH = "d9a2e9231aac642ac5e5edc2ba7b8d056c11d856f26859ac59a41adeefb4179abdcdf73cfc5a9e1a5bbe48e1bda9d39c43a36cba65a7acf36b37b707f6b42e5d"

RPROVIDES:${PN} += "ruby4.0-rubygem-excon \
rubygem-excon \
rubygem-ruby-4.0.0-excon \
rubygem-ruby-4.0.0-excon-1 \
rubygem-ruby-4.0.0-excon-1.1 \
rubygem-ruby-4.0.0-excon-1.1.1"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
