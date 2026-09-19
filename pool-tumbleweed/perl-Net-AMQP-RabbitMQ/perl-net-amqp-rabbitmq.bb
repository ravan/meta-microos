SUMMARY = "Interact with RabbitMQ over AMQP using librabbitmq"
DESCRIPTION = "'Net::AMQP::RabbitMQ' provides a simple wrapper around the librabbitmq \
library that allows connecting, declaring exchanges and queues, binding and \
unbinding queues, publishing, consuming and receiving events. \
 \
Error handling in this module is primarily achieve by 'Perl_croak' (die). \
You should be making good use of 'eval' around these methods to ensure that \
you appropriately catch the errors."
LICENSE = "MPL-1.1"

PV = "2.40014"

RPM_NAME = "perl-Net-AMQP-RabbitMQ-2.40014-1.11.aarch64.rpm"
RPM_HASH = "e437c171f28bec524e90ea635dbcd2a51730db5956cc788d6673c4ec07a359cf776779fa6172f8aa1d88c2703b43a5b726306d3456a1e4f6b892fe202134040d"

RPROVIDES:${PN} += "perl-Net--AMQP--RabbitMQ \
perl-Net-AMQP-RabbitMQ"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
perl--MODULE-COMPAT-5.44.0 \
perl-Math--Int64"

inherit rpm
