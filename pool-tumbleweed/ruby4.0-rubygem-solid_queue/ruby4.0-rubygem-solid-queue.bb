SUMMARY = "Database-backed Active Job backend"
DESCRIPTION = "Database-backed Active Job backend."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "ruby4.0-rubygem-solid_queue-1.4.0-1.2.aarch64.rpm"
RPM_HASH = "4eecc75e371ad42e6fcb0cd1df94ade7e0e6051e98deabf271655f9153e41494895ebd6091b1626376235a4537f67100dca28e8510daf6c5391f802b6e246f4d"

RPROVIDES:${PN} += "ruby4.0-rubygem-solid-queue \
rubygem-ruby-4.0.0-solid-queue \
rubygem-ruby-4.0.0-solid-queue-1 \
rubygem-ruby-4.0.0-solid-queue-1.4 \
rubygem-ruby-4.0.0-solid-queue-1.4.0 \
rubygem-solid-queue"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
ruby-abi \
rubygem-ruby-4.0.0-activejob \
rubygem-ruby-4.0.0-activerecord \
rubygem-ruby-4.0.0-concurrent-ruby \
rubygem-ruby-4.0.0-fugit-1 \
rubygem-ruby-4.0.0-railties \
rubygem-ruby-4.0.0-thor"

inherit rpm
