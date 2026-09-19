SUMMARY = "Microsoft Azure Education Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Education Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0~b3"

RPM_NAME = "python314-azure-mgmt-education-1.0.0~b3-1.1.noarch.rpm"
RPM_HASH = "55489025e9b0723436fdc8f0c0a67b770ea068205d666c7e15e02df3c265ba1327966fa31c8fa8a0a9ccd7e34ad088cd346febe70c2272357d5a39ff89a0b20e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-education \
python314-azure-mgmt-education \
python3dist-azure-mgmt-education"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
