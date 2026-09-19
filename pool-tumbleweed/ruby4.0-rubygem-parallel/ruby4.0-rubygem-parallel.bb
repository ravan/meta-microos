SUMMARY = "Run any kind of code in parallel processes"
DESCRIPTION = "Run any kind of code in parallel processes."
LICENSE = "MIT"

PV = "1.26.3"

RPM_NAME = "ruby4.0-rubygem-parallel-1.26.3-1.10.aarch64.rpm"
RPM_HASH = "0cd05ef854a743df9e8d50d7e8d3e13e6d176a9d13a13bbcf9d8b20df34baf6a6979d5ac6989dbbff272905e24da6c7a7d9a8e7eab6d71467762d45635b86136"

RPROVIDES:${PN} += "ruby4.0-rubygem-parallel \
rubygem-parallel \
rubygem-ruby-4.0.0-parallel \
rubygem-ruby-4.0.0-parallel-1 \
rubygem-ruby-4.0.0-parallel-1.26 \
rubygem-ruby-4.0.0-parallel-1.26.3"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
