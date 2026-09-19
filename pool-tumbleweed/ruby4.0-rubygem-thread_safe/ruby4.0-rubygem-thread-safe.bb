SUMMARY = "Thread-safe collections and utilities for Ruby"
DESCRIPTION = "A collection of data structures and utilities to make thread-safe programming \
in Ruby easier."
LICENSE = "Apache-2.0"

PV = "0.3.6"

RPM_NAME = "ruby4.0-rubygem-thread_safe-0.3.6-1.42.aarch64.rpm"
RPM_HASH = "3c3a6210e36e18c0f2050f1949e48fdd5c0c7e67e729e178b9f09638bc2e7f30e287a549e9eb4102099996953f45d4a18d376c5c415f8efca78ead93ad53c8ca"

RPROVIDES:${PN} += "ruby4.0-rubygem-thread-safe \
rubygem-ruby-4.0.0-thread-safe \
rubygem-ruby-4.0.0-thread-safe-0 \
rubygem-ruby-4.0.0-thread-safe-0.3 \
rubygem-ruby-4.0.0-thread-safe-0.3.6 \
rubygem-thread-safe"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
ruby-abi"

inherit rpm
