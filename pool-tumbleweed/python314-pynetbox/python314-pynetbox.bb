SUMMARY = "NetBox API client library"
DESCRIPTION = "Python API client library for NetBox."
LICENSE = "Apache-2.0"

PV = "7.8.0"

RPM_NAME = "python314-pynetbox-7.8.0-1.2.noarch.rpm"
RPM_HASH = "223b17b35bca0d00e7f4cdf8fa0bd45123aa8596fdc23392cfab548ca23f1f847cad0c448e4298bb2e76fe71c866ed23fd4782d3352986595f220e572ce6b207"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pynetbox \
python314-pynetbox \
python3dist-pynetbox"

RDEPENDS:${PN} += "python-abi \
python314-packaging \
python314-requests \
python314-urllib3"

inherit rpm
