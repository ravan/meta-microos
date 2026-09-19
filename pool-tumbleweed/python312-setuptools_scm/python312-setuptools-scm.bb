SUMMARY = "Python setuptools handler for SCM tags"
DESCRIPTION = "The setuptools_scm package handles managing one's Python package versions \
in SCM metadata. It also handles file finders for the supperted SCMs."
LICENSE = "MIT"

PV = "10.0.5"

RPM_NAME = "python312-setuptools_scm-10.0.5-1.3.noarch.rpm"
RPM_HASH = "caa5f74c6beb18a3cde2e1b1075c63849ac129c12b19d66a4bf6ba5df8dde5e469228ca08fb1a011c9f8421c1dbdf3db6689afde46d945d9b1b01a65c05fe75a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-setuptools-scm \
python312-setuptools-scm \
python3dist-setuptools-scm"

RDEPENDS:${PN} += "/usr/bin/python3.12 \
alts \
python-abi \
python312-packaging \
python312-setuptools \
python312-vcs-versioning"

inherit rpm
