SUMMARY = "Net::SSH: a pure-Ruby implementation of the SSH2 client protocol"
DESCRIPTION = "Net::SSH: a pure-Ruby implementation of the SSH2 client protocol. It allows \
you to write programs that invoke and interact with processes on remote \
servers, via SSH2."
LICENSE = "MIT"

PV = "7.3.0"

RPM_NAME = "ruby4.0-rubygem-net-ssh-7.3.0-1.10.aarch64.rpm"
RPM_HASH = "217f1aff65f799c2e056f85b3d7895cc0752ac878ed7d393d861917f920fe8599e023b003c612621196a4d6965a6301ec1d6ab63a9db94e234d95a6ef5dbf697"

RPROVIDES:${PN} += "ruby4.0-rubygem-net-ssh \
rubygem-net-ssh \
rubygem-ruby-4.0.0-net-ssh \
rubygem-ruby-4.0.0-net-ssh-7 \
rubygem-ruby-4.0.0-net-ssh-7.3 \
rubygem-ruby-4.0.0-net-ssh-7.3.0"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
ruby-abi"

inherit rpm
