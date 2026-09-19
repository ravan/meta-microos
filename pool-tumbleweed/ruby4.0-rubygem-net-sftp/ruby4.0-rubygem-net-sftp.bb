SUMMARY = "A pure Ruby implementation of the SFTP client protocol"
DESCRIPTION = "A pure Ruby implementation of the SFTP client protocol."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "ruby4.0-rubygem-net-sftp-4.0.0-1.19.aarch64.rpm"
RPM_HASH = "4acb404266b3052dc0d49f5e8e92b09040c6fcfe267f22604f74a99d786377a6c6fb269bd8fdcac835e6818111c265c54e4747a0cf24c6824bc3549090af9249"

RPROVIDES:${PN} += "ruby4.0-rubygem-net-sftp \
rubygem-net-sftp \
rubygem-ruby-4.0.0-net-sftp \
rubygem-ruby-4.0.0-net-sftp-4 \
rubygem-ruby-4.0.0-net-sftp-4.0 \
rubygem-ruby-4.0.0-net-sftp-4.0.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-net-ssh"

inherit rpm
