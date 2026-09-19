SUMMARY = "A library for managing Cisco NX-OS devices through NX-API"
DESCRIPTION = "A library for managing Cisco NX-OS devices through NX-API"
LICENSE = "Apache-2.0"

PV = "0.0.5"

RPM_NAME = "python313-pynxos-0.0.5-2.12.noarch.rpm"
RPM_HASH = "64c3b7ba4ebe09de931e69e17fd60520e7c6be53690e1657f613a349a30951261a8dc0c3769bf2524d9ee3af4c7df4b7ba2014bea85d6d30d6242f71edf09b4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pynxos \
python3.13dist-pynxos \
python313-pynxos \
python3dist-pynxos"

RDEPENDS:${PN} += "python-abi \
python313-requests \
python313-scp"

inherit rpm
