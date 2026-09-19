SUMMARY = "Python client for Elasticsearch"
DESCRIPTION = "Official low-level client for Elasticsearch. Its goal is to provide common \
ground for all Elasticsearch-related code in Python; because of this it tries \
to be opinion-free and very extendable."
LICENSE = "Apache-2.0"

PV = "9.5.0"

RPM_NAME = "python314-elasticsearch-9.5.0-1.1.noarch.rpm"
RPM_HASH = "813931fb3d3718026dad5c3cf2d2d9a9590330c05551a5ee8dbe38636082891f22a8208ac9ad4e58e66023781f1f35f97299af4d15ee790bd732866224521978"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-elasticsearch \
python314-elasticsearch \
python314-elasticsearch-dsl \
python3dist-elasticsearch"

RDEPENDS:${PN} += "python-abi \
python314-anyio \
python314-elastic-transport \
python314-python-dateutil \
python314-sniffio \
python314-typing-extensions"

inherit rpm
