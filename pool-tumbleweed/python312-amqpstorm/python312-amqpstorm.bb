SUMMARY = "Thread-safe Python RabbitMQ Client & Management library"
DESCRIPTION = "Thread-safe Python RabbitMQ Client & Management library. \
 \
Supports Python 2.7 and Python 3.3+. \
Tested against CPython, PyPy and Pyston. \
When using a SSL connection, TLSv1 or higher is required."
LICENSE = "MIT"

PV = "2.10.7"

RPM_NAME = "python312-amqpstorm-2.10.7-2.1.noarch.rpm"
RPM_HASH = "4c2f3a844175bb075875fddb4372fce4df59eacf12c31d1ca8329ca1557018dae108c754d6b0f6ce73737eacb6c20955fd91f68b87690dfec0fabe465b83a300"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-amqpstorm \
python312-amqpstorm \
python3dist-amqpstorm"

RDEPENDS:${PN} += "python-abi \
python312-pamqp \
python312-requests"

inherit rpm
