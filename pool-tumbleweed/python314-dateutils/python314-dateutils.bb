SUMMARY = "Python library for working with date and datetime objects"
DESCRIPTION = "Python library for working with date and datetime objects."
LICENSE = "0BSD"

PV = "0.6.12"

RPM_NAME = "python314-dateutils-0.6.12-3.5.noarch.rpm"
RPM_HASH = "2b90bff5b3b9a516daf324184c09fa7c71f671e983d085a2c529cd760e32c59323d550b0271bd09d9fb26349eeb78585627f7d3cb032ce512c572f69b1811afc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dateutils \
python314-dateutils \
python3dist-dateutils"

RDEPENDS:${PN} += "python-abi \
python314-python-dateutil \
python314-pytz"

inherit rpm
