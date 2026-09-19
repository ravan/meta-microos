SUMMARY = "Microsoft Azure Voiceservices Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Voiceservices Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-voiceservices-1.0.0-2.9.noarch.rpm"
RPM_HASH = "1a6ada4f6f042ff10093e236db828e4b324984f04d7a084a103171905b7d3d615174e020cb3a57737df6235353c8ea4be9f2a477ca0dce751e47bab8765a49e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-voiceservices \
python314-azure-mgmt-voiceservices \
python3dist-azure-mgmt-voiceservices"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
