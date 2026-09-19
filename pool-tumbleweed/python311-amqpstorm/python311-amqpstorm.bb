SUMMARY = "Thread-safe Python RabbitMQ Client & Management library"
DESCRIPTION = "Thread-safe Python RabbitMQ Client & Management library. \
 \
Supports Python 2.7 and Python 3.3+. \
Tested against CPython, PyPy and Pyston. \
When using a SSL connection, TLSv1 or higher is required."
LICENSE = "MIT"

PV = "2.10.7"

RPM_NAME = "python311-amqpstorm-2.10.7-2.1.noarch.rpm"
RPM_HASH = "e9874c49bb65c466a0b617729cc9f3b9b71559d11dd94b63992860769f11cbcb9c48f2fdea2509cfef1c580550496b8ed96b84873c50a9a8aef046a26f6bb18b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-amqpstorm \
python311-amqpstorm \
python3dist-amqpstorm"

RDEPENDS:${PN} += "python-abi \
python311-pamqp \
python311-requests"

inherit rpm
