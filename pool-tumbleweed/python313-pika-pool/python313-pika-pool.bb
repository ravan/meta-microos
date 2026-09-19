SUMMARY = "Pools for pikas"
DESCRIPTION = "Pika connection pooling inspired by: \
 \
- `flask-pika <https://github.com/WeatherDecisionTechnologies/flask-pika>`_ \
- `sqlalchemy.pool.Pool <http://docs.sqlalchemy.org/en/latest/core/pooling.html#sqlalchemy.pool.Pool>`_ \
 \
Typically you'll go with local `shovels <https://www.rabbitmq.com/shovel.html>`_, `krazee-eyez kombu <http://bit.ly/1txcnnO>`_, etc. but this works too."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "python313-pika-pool-0.1.3-6.5.noarch.rpm"
RPM_HASH = "238934da007c11996ce7cba44b0bb15a9c440be9b434eea8a266f8739f0da9269d1758458a332489cce3e203edeaddceef739725a54328e6277ce35d1896e405"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pika-pool \
python3.13dist-pika-pool \
python313-pika-pool \
python3dist-pika-pool"

RDEPENDS:${PN} += "python-abi \
python313-pika"

inherit rpm
