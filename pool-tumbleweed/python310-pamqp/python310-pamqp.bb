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

RPM_NAME = "python310-pamqp-3.2.1-1.5.noarch.rpm"
RPM_HASH = "cf513e88f85dac97e4411dda1a4d3eaaf5efcf3cd3e31c5e74e8c0e31a8f7fe2bfb97eb53e6cfacba2b3b993eaf230a18c831f6e91b451c9c7c50e81b296fb70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pamqp \
python310-pamqp \
python3dist-pamqp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
