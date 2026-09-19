SUMMARY = "Python library for programming ACI"
DESCRIPTION = "Python Library for configuring the Cisco Application Policy \
Infrastructure Controller."
LICENSE = "Apache-2.0"

PV = "0.4"

RPM_NAME = "python313-acitoolkit-0.4-8.8.noarch.rpm"
RPM_HASH = "6980bbce70c77badf8d51fae36eb7e950952f9dea0607516cdf6b70b0e7fee18e02f233e55920ba0ede8da0cf9c0ac0a090e9a6788b367d04bb629473de6b27e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-acitoolkit \
python3.13dist-acitoolkit \
python313-acitoolkit \
python3dist-acitoolkit"

RDEPENDS:${PN} += "python-abi \
python313-graphviz \
python313-jsonschema \
python313-requests \
python313-tabulate \
python313-websocket-client"

inherit rpm
