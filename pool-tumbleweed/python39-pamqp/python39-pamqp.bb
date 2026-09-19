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

RPM_NAME = "python39-pamqp-3.2.1-1.5.noarch.rpm"
RPM_HASH = "408846c40d565c3552ead20f9118f5d1609a979add0a74f2294c72736d2a54835b3eb56dd47fc01d4b2ddcc1ab2069e4275f66dddb9e7ff24a88f88fef62ed15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pamqp \
python39-pamqp \
python3dist-pamqp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
