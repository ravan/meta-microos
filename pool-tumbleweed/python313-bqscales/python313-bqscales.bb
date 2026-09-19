SUMMARY = "Grammar of Graphics in Python"
DESCRIPTION = "Grammar of Graphics in Python for bqplot and other Jupyter widgets \
libraries"
LICENSE = "Apache-2.0"

PV = "0.3.7"

RPM_NAME = "python313-bqscales-0.3.7-1.1.noarch.rpm"
RPM_HASH = "7a2f6b2b61d51dfd9756f9acce47729045fa207d592c8ed759374a5a1bec721a92882b7c4f9d1c7767a1b32ee90e3bbd2a7c96463d8a60b2984eeebbedf71663"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bqscales \
python3.13dist-bqscales \
python313-bqscales \
python3dist-bqscales"

RDEPENDS:${PN} += "python-abi \
python313-ipywidgets \
python313-numpy \
python313-traitlets \
python313-traittypes"

inherit rpm
