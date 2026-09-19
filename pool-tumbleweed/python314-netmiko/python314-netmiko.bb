SUMMARY = "Multi-vendor library to simplify Paramiko SSH connections to network devices"
DESCRIPTION = "Multi-vendor library to simplify Paramiko SSH connections to network devices."
LICENSE = "MIT"

PV = "4.7.0"

RPM_NAME = "python314-netmiko-4.7.0-1.2.noarch.rpm"
RPM_HASH = "973e19091806d3440163dae646f12bfd31b14e15501559ff7e03a355b17602e117f849257441c03041efa71ca98675f9d370aaca33fb1f7ca2acb2441e6371cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-netmiko \
python314-netmiko \
python3dist-netmiko"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-PyYAML \
python314-ntc-templates \
python314-paramiko \
python314-pyserial \
python314-rich \
python314-ruamel.yaml \
python314-scp \
python314-textfsm \
update-alternatives"

inherit rpm
