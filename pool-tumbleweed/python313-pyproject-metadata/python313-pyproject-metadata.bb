SUMMARY = "PEP 621 metadata parsing"
DESCRIPTION = "Dataclass for PEP 621 metadata with support for core metadata generation \
 \
This project does not implement the parsing of `pyproject.toml` \
containing PEP 621 metadata. \
 \
Instead, given a Python data structure representing PEP 621 metadata (already \
parsed), it will validate this input and generate a PEP 643-compliant metadata \
file (e.g. `PKG-INFO`)."
LICENSE = "MIT"

PV = "0.12.1"

RPM_NAME = "python313-pyproject-metadata-0.12.1-1.1.noarch.rpm"
RPM_HASH = "09562f50bcafbd2573240fd96338c6484dcae1bbf9e5e5eb988e35e9a37e642df8e7add999f19ac23b9f182a1f4bc4145a16386172e4cebcf0857bd0de2340b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyproject-metadata \
python3.13dist-pyproject-metadata \
python313-pyproject-metadata \
python3dist-pyproject-metadata"

RDEPENDS:${PN} += "python-abi \
python313-packaging"

inherit rpm
