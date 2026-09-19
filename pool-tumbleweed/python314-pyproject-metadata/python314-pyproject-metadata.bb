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

RPM_NAME = "python314-pyproject-metadata-0.12.1-1.1.noarch.rpm"
RPM_HASH = "977da76674b1a1827264f32cae3da53c8fcd3aa14f2393fcdf2bda044d84dc4339db0c6d21a1f2871e0811701da43d3cdf1cdf1ab240007f0019c851f071b5af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyproject-metadata \
python314-pyproject-metadata \
python3dist-pyproject-metadata"

RDEPENDS:${PN} += "python-abi \
python314-packaging"

inherit rpm
