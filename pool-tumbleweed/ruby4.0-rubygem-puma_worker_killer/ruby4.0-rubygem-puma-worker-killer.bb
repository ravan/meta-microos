SUMMARY = "If you have a memory leak in your web code puma_worker_killer can"
DESCRIPTION = "Kills pumas, the code kind ."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "ruby4.0-rubygem-puma_worker_killer-1.0.0-1.10.aarch64.rpm"
RPM_HASH = "b1294bc210c4607cbde8761d4908f89e381b71246a473ff2d9c3dc5dd0099a5d6b41fb2e242577be8182caf404effbd85765d071e5946562505ad645c76152dc"

RPROVIDES:${PN} += "ruby4.0-rubygem-puma-worker-killer \
rubygem-puma-worker-killer \
rubygem-ruby-4.0.0-puma-worker-killer \
rubygem-ruby-4.0.0-puma-worker-killer-1 \
rubygem-ruby-4.0.0-puma-worker-killer-1.0 \
rubygem-ruby-4.0.0-puma-worker-killer-1.0.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-bigdecimal \
rubygem-ruby-4.0.0-get-process-mem \
rubygem-ruby-4.0.0-puma"

inherit rpm
