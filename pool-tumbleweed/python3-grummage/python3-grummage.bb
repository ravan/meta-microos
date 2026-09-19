SUMMARY = "Interactive terminal frontend to Grype"
DESCRIPTION = "Grype + Rummage = Grummage. \
 \
Grummage is an interactive terminal frontend to Grype."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python3-grummage-1.0.0-1.4.noarch.rpm"
RPM_HASH = "546a416679aea446e3a4ca15d8c9fe56d097b6d5147fc8efa6892119309e533277b912e6513b7782f01d9e87d5a8cf3b78d4dc94630f61e9f4770fc21c02359b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-grummage"

RDEPENDS:${PN} += "/usr/bin/python3 \
grype \
python3-textual \
update-alternatives"

inherit rpm
