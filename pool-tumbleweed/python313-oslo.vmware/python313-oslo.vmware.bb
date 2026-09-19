SUMMARY = "Oslo VMware library for OpenStack projects"
DESCRIPTION = "The Oslo project intends to produce a python library containing infrastructure \
code shared by OpenStack projects. The APIs provided by the project should be \
high quality, stable, consistent and generally useful. \
 \
The Oslo VMware library offers session and API call management for VMware ESX/VC \
server."
LICENSE = "Apache-2.0"

PV = "4.10.1"

RPM_NAME = "python313-oslo.vmware-4.10.1-1.1.noarch.rpm"
RPM_HASH = "06a69b3f7d97c3508f8ba06bb490f615856a80e5dbe995e2b186099a1e1f1785d8d4a379cb49fc10c095caa4073f964abcbc8db3dda12afad0461cdbb1835202"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.vmware \
python3.13dist-oslo.vmware \
python313-oslo.vmware \
python3dist-oslo.vmware"

RDEPENDS:${PN} += "python-abi \
python313-defusedxml \
python313-eventlet \
python313-lxml \
python313-oslo.concurrency \
python313-oslo.context \
python313-oslo.i18n \
python313-oslo.service \
python313-oslo.utils \
python313-requests \
python313-suds-community \
python313-urllib3"

inherit rpm
