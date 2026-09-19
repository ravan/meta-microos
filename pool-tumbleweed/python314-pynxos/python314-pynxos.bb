SUMMARY = "A library for managing Cisco NX-OS devices through NX-API"
DESCRIPTION = "A library for managing Cisco NX-OS devices through NX-API"
LICENSE = "Apache-2.0"

PV = "0.0.5"

RPM_NAME = "python314-pynxos-0.0.5-2.12.noarch.rpm"
RPM_HASH = "06cf98b1061e083f6d4ea5c45514a68480fb6c2ca3cde4899e9182eab9b5f3cd68ee8102e8dabbd4244430a8ea225f8739dc0ee5b834ffbc7d02bbcb294821cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pynxos \
python314-pynxos \
python3dist-pynxos"

RDEPENDS:${PN} += "python-abi \
python314-requests \
python314-scp"

inherit rpm
