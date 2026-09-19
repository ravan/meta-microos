SUMMARY = "Interactive terminal frontend for viewing SBOM files"
DESCRIPTION = "Interactive terminal frontend for viewing Software Bill of Materials (SBOM) \
files in various formats."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python3-sbommage-1.0.2-1.5.noarch.rpm"
RPM_HASH = "c1eb8093bebc8839c24c4e2a4c987a37ac9d693057667e5dc3f153fb057b612b57bb77708b2bffd25ac23ffec5953b93760493ebcbd8e6b438a4452f556906d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sbommage \
python3.13dist-sbommage \
python3dist-sbommage"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
python-abi \
python3-textual"

inherit rpm
