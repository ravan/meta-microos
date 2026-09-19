SUMMARY = "Run external commands on Unix or Windows"
DESCRIPTION = "Run external commands on Unix or Windows."
LICENSE = "Apache-2.0"

PV = "3.3.3"

RPM_NAME = "ruby4.0-rubygem-mixlib-shellout-3.3.3-1.10.aarch64.rpm"
RPM_HASH = "b17bdc9211f3ceafa5520de7d3e986a982648c1263058d382ebecc665fad60768fdcc2efd0dd29d06e9aa25d391a40030eb2c6434ffe250b8f8e3b0fda87d94a"

RPROVIDES:${PN} += "ruby4.0-rubygem-mixlib-shellout \
rubygem-mixlib-shellout \
rubygem-ruby-4.0.0-mixlib-shellout \
rubygem-ruby-4.0.0-mixlib-shellout-3 \
rubygem-ruby-4.0.0-mixlib-shellout-3.3 \
rubygem-ruby-4.0.0-mixlib-shellout-3.3.3"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-chef-utils"

inherit rpm
