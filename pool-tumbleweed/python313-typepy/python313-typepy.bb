SUMMARY = "Python library for run time variable type checker"
DESCRIPTION = "typepy is a Python library for variable type checker/validator/converter at run time."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-typepy-2.0.0-1.2.noarch.rpm"
RPM_HASH = "5a8b1af8603d63c4ebe9d913e3dc403ba6c0d0316f6f2f92d78c57e6b8292fa763b0c9c51145e5857925b172a0c515972e3ea77d0379acf9b62c9d37beef558d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-typepy \
python3.13dist-typepy \
python313-typepy \
python3dist-typepy"

RDEPENDS:${PN} += "python-abi \
python313-mbstrdecoder \
python313-tzdata"

inherit rpm
