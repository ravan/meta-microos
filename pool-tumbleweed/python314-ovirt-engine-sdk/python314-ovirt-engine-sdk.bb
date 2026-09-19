SUMMARY = "Python SDK for oVirt Engine API"
DESCRIPTION = "Python SDK for oVirt Engine API"
LICENSE = "Apache-2.0"

PV = "4.4.9"

RPM_NAME = "python314-ovirt-engine-sdk-4.4.9-2.8.aarch64.rpm"
RPM_HASH = "7903a771bd022931379fecae3812bcada8a30ae0f7bcf26c482d8669b2b2bc012843e24aa961e813af277129f7802d72f6935ed2a7a52eca143742c1df620d97"

RPROVIDES:${PN} += "python3.14dist-ovirt-engine-sdk-python \
python314-ovirt-engine-sdk \
python3dist-ovirt-engine-sdk-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.16 \
python-abi \
python314-pycurl \
python314-six"

inherit rpm
