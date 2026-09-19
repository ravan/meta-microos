SUMMARY = "Pools for pikas"
DESCRIPTION = "Pika connection pooling inspired by: \
 \
- `flask-pika <https://github.com/WeatherDecisionTechnologies/flask-pika>`_ \
- `sqlalchemy.pool.Pool <http://docs.sqlalchemy.org/en/latest/core/pooling.html#sqlalchemy.pool.Pool>`_ \
 \
Typically you'll go with local `shovels <https://www.rabbitmq.com/shovel.html>`_, `krazee-eyez kombu <http://bit.ly/1txcnnO>`_, etc. but this works too."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "python314-pika-pool-0.1.3-6.5.noarch.rpm"
RPM_HASH = "adc7a4231f660d073ba150e3d8790350fd439d7a7f35dcfd693b8b1c46dae327a96f1335eb9337a1926700e1f4ec389c6b566c49689b1e7af97e750542e4494c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pika-pool \
python314-pika-pool \
python3dist-pika-pool"

RDEPENDS:${PN} += "python-abi \
python314-pika"

inherit rpm
