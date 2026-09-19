SUMMARY = "Multi-vendor library to simplify Paramiko SSH connections to network devices"
DESCRIPTION = "Multi-vendor library to simplify Paramiko SSH connections to network devices."
LICENSE = "MIT"

PV = "4.7.0"

RPM_NAME = "python313-netmiko-4.7.0-1.2.noarch.rpm"
RPM_HASH = "ae8e312e5194cae19c8c080377b703c0cddac67eb06206e2bdbe85e3f80b8109c83d811ea65bb393eb9f75a4f37efca1fcf7522830f39af17bd72af52a12c61a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-netmiko \
python3.13dist-netmiko \
python313-netmiko \
python3dist-netmiko"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-PyYAML \
python313-ntc-templates \
python313-paramiko \
python313-pyserial \
python313-rich \
python313-ruamel.yaml \
python313-scp \
python313-textfsm \
update-alternatives"

inherit rpm
