SUMMARY = "Log4r, logging framework for ruby"
DESCRIPTION = "See also: http://logging.apache.org/log4j."
LICENSE = "GPL-2.0+ | Ruby"

PV = "1.1.10"

RPM_NAME = "ruby4.0-rubygem-log4r-1.1.10-9.45.aarch64.rpm"
RPM_HASH = "283edc8ed088e8d0d1e0cc50f9830cf84c0aaba1bfaa84c991349af09afb832aec908719c44f0247ac287b78ab786780d06df73efdf6d87847e20d8ebd5c1c67"

RPROVIDES:${PN} += "ruby4.0-rubygem-log4r \
rubygem-log4r \
rubygem-ruby-4.0.0-log4r \
rubygem-ruby-4.0.0-log4r-1 \
rubygem-ruby-4.0.0-log4r-1.1 \
rubygem-ruby-4.0.0-log4r-1.1.10"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
