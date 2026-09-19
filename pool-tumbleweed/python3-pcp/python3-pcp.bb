SUMMARY = "Performance Co-Pilot (PCP) Python3 bindings and documentation"
DESCRIPTION = "This python PCP module contains the language bindings for \
Performance Metric API (PMAPI) monitor tools and Performance \
Metric Domain Agent (PMDA) collector tools written in Python3."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "python3-pcp-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "740f4a2e97608eb7a1e4ee19e1a081be42cb198efba5b49d3437ddb82c3a40f3e511feda1c7b88180d7d8eb5aa143a020a89fe6f3e9eb1cb7756f88d18262329"

RPROVIDES:${PN} += "python3-pcp \
python3.13dist-pcp \
python3dist-pcp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-gui2 \
libpcp-import1 \
libpcp-mmv1 \
libpcp-pmda.so.3 \
libpcp.so.3 \
libpcp3 \
python-abi \
python3"

inherit rpm
