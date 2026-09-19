SUMMARY = "CMSIS-DAP debugger for python"
DESCRIPTION = "On-chip debugger and flasher tool for ARM microcontrollers."
LICENSE = "Apache-2.0"

PV = "0.43.1"

RPM_NAME = "python314-pyOCD-0.43.1-1.4.noarch.rpm"
RPM_HASH = "ab0ba1c74e96cccb61354e00fc7032b4e9df8cd8efda7182d74900664d239e5ff668af1a36fda8ec2c5ad415f5139af5cbcaea44dd09234f1ebe2822b1110f1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyocd \
python314-pyOCD \
python314-pyocd \
python3dist-pyocd"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-usb \
update-alternatives"

inherit rpm
