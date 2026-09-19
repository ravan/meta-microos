SUMMARY = "AMQP Plugin for collectd"
DESCRIPTION = "The AMQP plugin transmits or receives values collected by collectd via the \
Advanced Message Queuing Protocol (AMQP)."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-amqp-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "acd909da8b542e0243270bd3b51317d5bbb7f27264856ebeeaa18b99ad835ac235cb576ddaeb2727ff6e65e1a11c8f079bd02f9064a7cc0b20dea38df30914bb"

RPROVIDES:${PN} += "collectd-plugin-amqp"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
librabbitmq.so.4 \
libyajl.so.2"

inherit rpm
