SUMMARY = "InfluxDB 2.0 Python client library"
DESCRIPTION = "The Python client library for use with InfluxDB 2.x and Flux. \
InfluxDB 3.x users should instead use the lightweight v3 client library. \
InfluxDB 1.x users should use the v1 client library. \
 \
The API of the influxdb-client-python is not backwards-compatible with \
the old one - influxdb-python."
LICENSE = "MIT"

PV = "1.50.0"

RPM_NAME = "python313-influxdb-client-1.50.0-2.1.noarch.rpm"
RPM_HASH = "730db031598552a10f3e43c73fff5496bb7bb739ee775eb6786bae4d405cc6f71126f0c4b53fd15c0678dc55050ae4ea43280bc24181acf9a0ed2b6be9055486"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-influxdb-client \
python3.13dist-influxdb-client \
python313-influxdb-client \
python3dist-influxdb-client"

RDEPENDS:${PN} += "python-abi \
python313-certifi \
python313-python-dateutil \
python313-reactivex \
python313-urllib3"

inherit rpm
