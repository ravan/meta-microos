SUMMARY = "Thread-safe Python RabbitMQ Client & Management library"
DESCRIPTION = "Thread-safe Python RabbitMQ Client & Management library. \
 \
Supports Python 2.7 and Python 3.3+. \
Tested against CPython, PyPy and Pyston. \
When using a SSL connection, TLSv1 or higher is required."
LICENSE = "MIT"

PV = "2.10.7"

RPM_NAME = "python313-amqpstorm-2.10.7-2.5.noarch.rpm"
RPM_HASH = "24302188ed5f0c8eb429f71990d39bb58ba3f9c88dd990712cd195c4767b2159e67e7c8f63536167a681b4c971f650d848b4c7c75b7266dc8addc268736d7d05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-amqpstorm \
python3.13dist-amqpstorm \
python313-amqpstorm \
python3dist-amqpstorm"

RDEPENDS:${PN} += "python-abi \
python313-pamqp \
python313-requests"

inherit rpm
