SUMMARY = "Pytorch implementation of normalizing flows"
DESCRIPTION = "Pytorch implementation of normalizing flows."
LICENSE = "MIT"

PV = "1.7.3"

RPM_NAME = "python313-normflows-1.7.3-1.7.noarch.rpm"
RPM_HASH = "eb727bf4033e4c624cc0e53e64b5fb7d4329a5bd5c923189fe6d70b1ae7f5c066d6811adf9eda8a5454ceb5b3cbb30434a682daa86acc9a68157dce9c7d97aa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-normflows \
python3.13dist-normflows \
python313-normflows \
python3dist-normflows"

RDEPENDS:${PN} += "python-abi \
python313-numpy \
python313-torch"

inherit rpm
