SUMMARY = "Python Bindings for YARA (from Virus Total)"
DESCRIPTION = "python bindings for libyara. \
YARA is a tool to identify and classify malware samples."
LICENSE = "Apache-2.0"

PV = "4.5.4"

RPM_NAME = "python314-yara-4.5.4-2.2.aarch64.rpm"
RPM_HASH = "2bb854fec749acef144f8362f4294d21393581da527478ffb5da9504f9d302b58cd9a2185304b9653bca95b132c7b62368d3bafbf4ec6f32a7a667e8d0e01b72"

RPROVIDES:${PN} += "python3.14dist-yara-python \
python314-yara \
python3dist-yara-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyara.so.10 \
python-abi"

inherit rpm
