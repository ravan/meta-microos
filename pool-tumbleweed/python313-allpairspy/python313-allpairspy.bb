SUMMARY = "Pairwise test combinations generator"
DESCRIPTION = "Pairwise test combinations generator."
LICENSE = "MIT"

PV = "2.5.1"

RPM_NAME = "python313-allpairspy-2.5.1-3.5.noarch.rpm"
RPM_HASH = "a4332f3965187838c1d72a1c93927ae135750cd54e004158f8c65913d9f894b08782d2f9f9a4bb939acdd4868c7582275945108b5fb891314582d425fc815105"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-allpairspy \
python3.13dist-allpairspy \
python313-allpairspy \
python3dist-allpairspy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
