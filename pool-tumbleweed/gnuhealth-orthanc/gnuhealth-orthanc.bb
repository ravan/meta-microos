SUMMARY = "Integration module for Orthanc"
DESCRIPTION = "This package provides the interface to Orthanc and the imaging worklist"
LICENSE = "GPL-3.0-or-later"

PV = "5.0.7"

RPM_NAME = "gnuhealth-orthanc-5.0.7-1.2.noarch.rpm"
RPM_HASH = "910e99e5bf7ffc65372a13b3d7a2cc929a75d9fb8d552182a57b443002897c2b1822ae10621241c115c14e5f711fc7f9c492579ef6ac5aca336f5e0296072434"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuhealth-orthanc \
python3.13dist-gnuhealth-imaging-worklist \
python3.13dist-gnuhealth-orthanc \
python3dist-gnuhealth-imaging-worklist \
python3dist-gnuhealth-orthanc"

RDEPENDS:${PN} += "gnuhealth \
python-abi \
python3-beren \
python3-pendulum \
python3-pydicom \
python3-pyorthanc"

inherit rpm
