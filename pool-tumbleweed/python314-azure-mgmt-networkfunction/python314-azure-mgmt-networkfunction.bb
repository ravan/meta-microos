SUMMARY = "Microsoft Azure Networkfunction Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Networkfunction Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python314-azure-mgmt-networkfunction-1.0.0~b2-1.3.noarch.rpm"
RPM_HASH = "9c399b25b07d73e0cfbc60cbabea0efade3d8465373c29206c9849741a31d73e537f71bfd237b31a6c8985c37cc2579861d3d43de449af7ccdec9e788711816f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-networkfunction \
python314-azure-mgmt-networkfunction \
python3dist-azure-mgmt-networkfunction"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
