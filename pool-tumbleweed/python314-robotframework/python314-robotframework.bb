SUMMARY = "Generic test automation framework for acceptance testing and ATDD"
DESCRIPTION = "Robot Framework is a generic open source automation framework for acceptance \
testing, acceptance test driven development (ATDD), and robotic process \
automation (RPA). It has simple plain text syntax and it can be extended easily \
with libraries implemented using Python or Java."
LICENSE = "Apache-2.0"

PV = "7.3.2"

RPM_NAME = "python314-robotframework-7.3.2-1.5.noarch.rpm"
RPM_HASH = "9f761668eb825b041de1a2b4195637606c717f673d994cd49f0d4e9489014f372088e88466fa4a3cfbe464fc129b1ec6e34617933c289a9fbce8a3e4300bdf45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-robotframework \
python314-robotframework \
python3dist-robotframework"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-setuptools \
update-alternatives"

inherit rpm
