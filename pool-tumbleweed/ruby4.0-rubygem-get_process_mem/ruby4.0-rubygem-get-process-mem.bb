SUMMARY = "Use GetProcessMem to find out the amount of RAM used by any process"
DESCRIPTION = "Get memory usage of a process in Ruby ."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "ruby4.0-rubygem-get_process_mem-1.0.0-1.10.aarch64.rpm"
RPM_HASH = "b7c6876be68d07e5258f8637e698a19a97205c2d658d782ff84b1794e86012f2f55f2b6e8cb3945b1e21006e9ffb951857c0db0a53b44c7fcdb69e48b6eeb57d"

RPROVIDES:${PN} += "ruby4.0-rubygem-get-process-mem \
rubygem-get-process-mem \
rubygem-ruby-4.0.0-get-process-mem \
rubygem-ruby-4.0.0-get-process-mem-1 \
rubygem-ruby-4.0.0-get-process-mem-1.0 \
rubygem-ruby-4.0.0-get-process-mem-1.0.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-bigdecimal \
rubygem-ruby-4.0.0-ffi-1"

inherit rpm
