SUMMARY = "Low-level AMQP client for Python (fork of amqplib)"
DESCRIPTION = "This is a fork of amqplib_ which was originally written by Barry Pederson. \
It is maintained by the Celery_ project, and used by kombu as a pure python \
alternative when librabbitmq is not available. \
This library should be API compatible with librabbitmq."
LICENSE = "LGPL-2.1-or-later"

PV = "5.3.1"

RPM_NAME = "python314-amqp-5.3.1-2.5.noarch.rpm"
RPM_HASH = "5046f838ae3536c8c5f345c220eb93b216fe72933309dd3d84abe4b9c6dab2c0554e2905a8c2395191dc3889e75e457cadfe042ad16c2225ab09e2299187c54a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-amqp \
python314-amqp \
python3dist-amqp"

RDEPENDS:${PN} += "python-abi \
python314-vine"

inherit rpm
