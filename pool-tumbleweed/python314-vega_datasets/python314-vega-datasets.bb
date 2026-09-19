SUMMARY = "A Python package for offline access to Vega datasets"
DESCRIPTION = "A Python package for offline access to vega datasets. \
- Provide straightforward access in Python to the datasets made available \
- return the results in the form of a Pandas dataframe \
- wherever dataset size and/or license constraints make it possible, bundle the dataset with the package so that datasets can be loaded in the absence of a web connection"
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python314-vega_datasets-0.9.0-2.5.noarch.rpm"
RPM_HASH = "6016ddb9d6b4688419101c3010677c6a139540345908d36e3321518cf1833b7ce4875147b9a14c5f32a294802576bc03b0149a2ad5c135a6b186e85e4df6edf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-vega-datasets \
python314-vega-datasets \
python3dist-vega-datasets"

RDEPENDS:${PN} += "python-abi \
python314-pandas"

inherit rpm
