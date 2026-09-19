SUMMARY = "Transport classes and utilities shared among Python Elastic client libraries"
DESCRIPTION = "Transport classes and utilities shared among Python Elastic client libraries"
LICENSE = "Apache-2.0"

PV = "9.4.2"

RPM_NAME = "python314-elastic-transport-9.4.2-2.1.noarch.rpm"
RPM_HASH = "9c1a6d2809715c68db239c9932f5f4414b642642f284774247632f53a7160d616496d34f3553f55a330a66cfb1b573d628a26d6127e12308b01ec619eee76512"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-elastic-transport \
python314-elastic-transport \
python3dist-elastic-transport"

RDEPENDS:${PN} += "python-abi \
python314-certifi \
python314-sniffio \
python314-urllib3"

inherit rpm
