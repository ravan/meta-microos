SUMMARY = "Resource agent for SAP instance specific sapstartsrv service"
DESCRIPTION = "This is a resource agent for the instance specific SAP start framework. \
It controls the instance specific sapstartsrv process which provides the \
API to start, stop and check an SAP instance. \
 \
Authors: \
-------- \
    Fabian Herschel \
    Lars Pinne \
    Xabier Arbulu"
LICENSE = "GPL-2.0"

PV = "0.9.5+git.1751011207.4481e75"

RPM_NAME = "sapstartsrv-resource-agents-0.9.5+git.1751011207.4481e75-1.4.noarch.rpm"
RPM_HASH = "dcc219330b8f2ec8516b1f5cc7b545523ac17cdf2e9fab2eac076acc381e7e6185c275e675f5bf5e878c369e1bab062a341af3f854a49975deae6b29d6efe1d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sapstartsrv-resource-agents"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
pacemaker \
python3 \
python3-psutil \
resource-agents"

inherit rpm
