SUMMARY = "AMQP 0.9.1 encoding & decoding library"
DESCRIPTION = "amq-protocol is an AMQP 0.9.1 serialization library for Ruby. It is not a \
client: the library only handles serialization and deserialization."
LICENSE = "MIT"

PV = "2.3.2"

RPM_NAME = "ruby4.0-rubygem-amq-protocol-2.3.2-1.29.aarch64.rpm"
RPM_HASH = "016da8c06bdef8cc49d86d0180f6f0d0b079dfa29ec1a1a10cc46e91d7bf87a7e052bee80a4cce06acd578773eae59fded814aea749d605eef0716e3855f3db1"

RPROVIDES:${PN} += "ruby4.0-rubygem-amq-protocol \
rubygem-amq-protocol \
rubygem-ruby-4.0.0-amq-protocol \
rubygem-ruby-4.0.0-amq-protocol-2 \
rubygem-ruby-4.0.0-amq-protocol-2.3 \
rubygem-ruby-4.0.0-amq-protocol-2.3.2"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/ruby.ruby4.0 \
ruby-abi"

inherit rpm
