SUMMARY = "Setup signal handler which dumps backtrace of running threads and"
DESCRIPTION = "Setup signal handler which dumps backtrace of running threads and number of \
allocated objects per class. Require 'sigdump/setup', send SIGCONT, and see \
/tmp/sigdump-<pid>.log."
LICENSE = "MIT"

PV = "0.2.5"

RPM_NAME = "ruby4.0-rubygem-sigdump-0.2.5-1.15.aarch64.rpm"
RPM_HASH = "ceafa454299e5c5f01cf523a088facc5d780a6fcb599a8f21446ff8be48d21aeb398daf938df7b931a399b783f43056868bea2927f156520fdfd546b0786ab7f"

RPROVIDES:${PN} += "ruby4.0-rubygem-sigdump \
rubygem-ruby-4.0.0-sigdump \
rubygem-ruby-4.0.0-sigdump-0 \
rubygem-ruby-4.0.0-sigdump-0.2 \
rubygem-ruby-4.0.0-sigdump-0.2.5 \
rubygem-sigdump"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
