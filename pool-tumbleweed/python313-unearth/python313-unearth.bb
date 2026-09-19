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

RPM_NAME = "python313-unearth-0.18.3-1.1.noarch.rpm"
RPM_HASH = "1d5c7d10ce4faf5820ad8570098967be0958c6a8de8fda15986f9b68774bd57f65b97181a09b4ec3029296996144b2c41db25da9b275a0003ce8a30aabd8337c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-unearth \
python3.13dist-unearth \
python313-unearth \
python3dist-unearth"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-httpx \
python313-packaging \
update-alternatives"

inherit rpm
