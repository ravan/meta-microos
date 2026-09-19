SUMMARY = "Generic test automation framework for acceptance testing and ATDD"
DESCRIPTION = "Robot Framework is a generic open source automation framework for acceptance \
testing, acceptance test driven development (ATDD), and robotic process \
automation (RPA). It has simple plain text syntax and it can be extended easily \
with libraries implemented using Python or Java."
LICENSE = "Apache-2.0"

PV = "7.3.2"

RPM_NAME = "python313-robotframework-7.3.2-1.5.noarch.rpm"
RPM_HASH = "0801d851fbc44f5026aba9d6f68869c2e1a9b715a04ce507119ce1e4ba4ebf8894209f4a6238ff1fc490500f7a3b5f2179f249e8d54a6993aeb08c2d48936cab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-robotframework \
python3.13dist-robotframework \
python313-robotframework \
python3dist-robotframework"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-setuptools \
update-alternatives"

inherit rpm
