SUMMARY = "Thread-safe Python RabbitMQ Client & Management library"
DESCRIPTION = "Thread-safe Python RabbitMQ Client & Management library. \
 \
Supports Python 2.7 and Python 3.3+. \
Tested against CPython, PyPy and Pyston. \
When using a SSL connection, TLSv1 or higher is required."
LICENSE = "MIT"

PV = "2.10.7"

RPM_NAME = "python314-amqpstorm-2.10.7-2.5.noarch.rpm"
RPM_HASH = "e851cfec44f152053bf27f83ee27340dc55ff28d20051b87211c97163592871a297ba675d524e4c171b15288242999b546ea58efb50695c2d99682966b7f6861"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-amqpstorm \
python314-amqpstorm \
python3dist-amqpstorm"

RDEPENDS:${PN} += "python-abi \
python314-pamqp \
python314-requests"

inherit rpm
