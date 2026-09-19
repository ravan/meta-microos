SUMMARY = "Python library for programming ACI"
DESCRIPTION = "Python Library for configuring the Cisco Application Policy \
Infrastructure Controller."
LICENSE = "Apache-2.0"

PV = "0.4"

RPM_NAME = "python314-acitoolkit-0.4-8.8.noarch.rpm"
RPM_HASH = "0cef84282eee69228414b0ca8bde07bff780aaffe45a5b197437dffcdfc4b6edb3ee70d854cf4246fc224d09fdd75954612ef0289c6f6c5d112ad99fee0e5249"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-acitoolkit \
python314-acitoolkit \
python3dist-acitoolkit"

RDEPENDS:${PN} += "python-abi \
python314-graphviz \
python314-jsonschema \
python314-requests \
python314-tabulate \
python314-websocket-client"

inherit rpm
