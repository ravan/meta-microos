SUMMARY = "SSHKit makes it easy to write structured, testable SSH commands in"
DESCRIPTION = "A comprehensive toolkit for remotely running commands in a structured manner \
on groups of servers."
LICENSE = "MIT"

PV = "1.25.0"

RPM_NAME = "ruby4.0-rubygem-sshkit-1.25.0-1.2.aarch64.rpm"
RPM_HASH = "af94df5898ca170a5df66d6c45b47dec8982fdb6117378e84d47dd5510791aa79222571f9ecb7338f809baaa8b021bc99745381717cda0a9a4e8436fc063eb07"

RPROVIDES:${PN} += "ruby4.0-rubygem-sshkit \
rubygem-ruby-4.0.0-sshkit \
rubygem-ruby-4.0.0-sshkit-1 \
rubygem-ruby-4.0.0-sshkit-1.25 \
rubygem-ruby-4.0.0-sshkit-1.25.0 \
rubygem-sshkit"

RDEPENDS:${PN} += "/usr/bin/bash \
ruby-abi \
rubygem-ruby-4.0.0-base64 \
rubygem-ruby-4.0.0-logger \
rubygem-ruby-4.0.0-net-scp \
rubygem-ruby-4.0.0-net-sftp \
rubygem-ruby-4.0.0-net-ssh \
rubygem-ruby-4.0.0-ostruct"

inherit rpm
