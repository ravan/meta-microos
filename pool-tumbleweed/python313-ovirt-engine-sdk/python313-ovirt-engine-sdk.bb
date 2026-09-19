SUMMARY = "Python SDK for oVirt Engine API"
DESCRIPTION = "Python SDK for oVirt Engine API"
LICENSE = "Apache-2.0"

PV = "4.4.9"

RPM_NAME = "python313-ovirt-engine-sdk-4.4.9-2.8.aarch64.rpm"
RPM_HASH = "ec4bdaeab26c1adce521fec4148fe04002b124e36674cf9ded71b95aedf645a43aceb01773e24c2bf10f130d171dff55b2f56aedeff4e3a53d9a128b1c7395c1"

RPROVIDES:${PN} += "python3-ovirt-engine-sdk \
python3.13dist-ovirt-engine-sdk-python \
python313-ovirt-engine-sdk \
python3dist-ovirt-engine-sdk-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.16 \
python-abi \
python313-pycurl \
python313-six"

inherit rpm
