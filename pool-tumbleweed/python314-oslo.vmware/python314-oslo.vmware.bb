SUMMARY = "Oslo VMware library for OpenStack projects"
DESCRIPTION = "The Oslo project intends to produce a python library containing infrastructure \
code shared by OpenStack projects. The APIs provided by the project should be \
high quality, stable, consistent and generally useful. \
 \
The Oslo VMware library offers session and API call management for VMware ESX/VC \
server."
LICENSE = "Apache-2.0"

PV = "4.10.1"

RPM_NAME = "python314-oslo.vmware-4.10.1-1.1.noarch.rpm"
RPM_HASH = "b08068c5338c3f584a4bf523bead298027debb9a33fbc8aac59507d0a33a7223e4b773419b5f5b53f5a8e802c8c11136b959796e50fc32a996b0e73e3f47333b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-oslo.vmware \
python314-oslo.vmware \
python3dist-oslo.vmware"

RDEPENDS:${PN} += "python-abi \
python314-defusedxml \
python314-eventlet \
python314-lxml \
python314-oslo.concurrency \
python314-oslo.context \
python314-oslo.i18n \
python314-oslo.service \
python314-oslo.utils \
python314-requests \
python314-suds-community \
python314-urllib3"

inherit rpm
