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

RPM_NAME = "python313-pamqp-4.0.1-1.2.noarch.rpm"
RPM_HASH = "d55f3c08b1c0904bdd81c7ffc18260361ee0ab9bd0d8607da2cc7e5636d7f77dd9210af551b328291ff2bd6e1cd5c1fa43df734a09e5d9dd64a3e4a17782808a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pamqp \
python3.13dist-pamqp \
python313-pamqp \
python3dist-pamqp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
