SUMMARY = "Pure-python AMQP 0-9-1 frame encoder and decoder"
DESCRIPTION = "pamqp is a pure-python AMQP 0-9-1 frame encoder and decoder. \
 \
pamqp is not a end-user client library for talking to RabbitMQ but \
rather is used by client libraries for marshaling and unmarshaling \
AMQP frames. \
 \
AMQP class/method command class mappings can be found in the \
pamqp.specification module while actual frame encoding and \
encoding should be run through the pamqp.frame module."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python311-pamqp-3.2.1-1.5.noarch.rpm"
RPM_HASH = "dccc529c555f3cf3cfbb63bbd75194619a9e772a7e68eb50815a44934e4214e4ab2f948e1e5e18174fd9fac9f5af90d03e8100cd1429aa2e79bad5827dd1e954"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pamqp \
python3.11dist-pamqp \
python311-pamqp \
python3dist-pamqp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
