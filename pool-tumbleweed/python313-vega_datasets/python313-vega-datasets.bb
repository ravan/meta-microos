SUMMARY = "A Python package for offline access to Vega datasets"
DESCRIPTION = "A Python package for offline access to vega datasets. \
- Provide straightforward access in Python to the datasets made available \
- return the results in the form of a Pandas dataframe \
- wherever dataset size and/or license constraints make it possible, bundle the dataset with the package so that datasets can be loaded in the absence of a web connection"
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python313-vega_datasets-0.9.0-2.5.noarch.rpm"
RPM_HASH = "9c27516bb0d70d136972791d7c80a096b27bb82e8faae28cd3dd48bccb2161d1c0870f38a8a237d69afb60db2e854c53297c585f484865a4b828c49961a6a484"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vega-datasets \
python3.13dist-vega-datasets \
python313-vega-datasets \
python3dist-vega-datasets"

RDEPENDS:${PN} += "python-abi \
python313-pandas"

inherit rpm
