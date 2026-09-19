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

PV = "4.0.1"

RPM_NAME = "python314-pamqp-4.0.1-1.2.noarch.rpm"
RPM_HASH = "ef2a955ee6bff71c15dda6458f35004f6ee8ad25ff39ed7ceeb51a20c96c30aeacb84f53a0a81854d22705aba0a54b3eadc98436b8514b49af4bb33a137a3b6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pamqp \
python314-pamqp \
python3dist-pamqp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
