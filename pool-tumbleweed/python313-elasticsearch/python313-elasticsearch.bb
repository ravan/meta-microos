SUMMARY = "Python client for Elasticsearch"
DESCRIPTION = "Official low-level client for Elasticsearch. Its goal is to provide common \
ground for all Elasticsearch-related code in Python; because of this it tries \
to be opinion-free and very extendable."
LICENSE = "Apache-2.0"

PV = "9.5.0"

RPM_NAME = "python313-elasticsearch-9.5.0-1.1.noarch.rpm"
RPM_HASH = "037d86a18599891f75b0970c4bd306b8108f21700589298eb99c7a691d5b83ad91e071b902ae0a318bdbb7522dff04af7e4658f91d7423b5feff9e3ef225b9f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-elasticsearch \
python3-elasticsearch-dsl \
python3.13dist-elasticsearch \
python313-elasticsearch \
python313-elasticsearch-dsl \
python3dist-elasticsearch"

RDEPENDS:${PN} += "python-abi \
python313-anyio \
python313-elastic-transport \
python313-python-dateutil \
python313-sniffio \
python313-typing-extensions"

inherit rpm
