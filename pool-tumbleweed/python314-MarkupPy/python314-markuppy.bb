SUMMARY = "An HTML/XML generator"
DESCRIPTION = "This is MarkupPy - a Python module that for generating HTML/XML \
for Python programs."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "1.18"

RPM_NAME = "python314-MarkupPy-1.18-1.2.noarch.rpm"
RPM_HASH = "90635911d470da0803107ff2a8a0ccf2ae123eee6895615948c5e1d920d95fb030bc8b33367f4714386462a8dd39ede5d3d69cab8e93576517524bd336ba637c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-markuppy \
python314-MarkupPy \
python3dist-markuppy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
