SUMMARY = "A utility to fetch and download python packages"
DESCRIPTION = "This project exists as the last piece to complete the puzzle of a package manager. The other pieces are: \
 \
- python-resolvelib - Resolves concrete dependencies from a set of (abstract) requirements. \
- python-unearth - Finds and downloads the best match(es) for a given requirement. \
- python-build - Builds wheels from the source code. \
- python-installer - Installs packages from wheels. \
 \
They provide all the low-level functionalities that are needed to resolve and install packages."
LICENSE = "MIT"

PV = "0.18.3"

RPM_NAME = "python314-unearth-0.18.3-1.1.noarch.rpm"
RPM_HASH = "835cd5853177ec4512ae47e601acfe4c2b62f8465722d7beab2cbfc2265f89971c0630f42a8663c2bbae98047ea952d1ff036740c4edd4e049a6f6ef515ceb0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-unearth \
python314-unearth \
python3dist-unearth"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-httpx \
python314-packaging \
update-alternatives"

inherit rpm
