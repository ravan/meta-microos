SUMMARY = "Low-level AMQP client for Python (fork of amqplib)"
DESCRIPTION = "This is a fork of amqplib_ which was originally written by Barry Pederson. \
It is maintained by the Celery_ project, and used by kombu as a pure python \
alternative when librabbitmq is not available. \
This library should be API compatible with librabbitmq."
LICENSE = "LGPL-2.1-or-later"

PV = "5.3.1"

RPM_NAME = "python313-amqp-5.3.1-2.5.noarch.rpm"
RPM_HASH = "feecc86753a3d37a872eaec1d96a698140c048b477133b31d67c78ef58e55c06c4625e09a4bbd7c92487ac4b63ba5df7e7d6b06363c73285e917eb453f4a69a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-amqp \
python3.13dist-amqp \
python313-amqp \
python3dist-amqp"

RDEPENDS:${PN} += "python-abi \
python313-vine"

inherit rpm
