SUMMARY = "Pytorch implementation of normalizing flows"
DESCRIPTION = "Pytorch implementation of normalizing flows."
LICENSE = "MIT"

PV = "1.7.3"

RPM_NAME = "python314-normflows-1.7.3-1.7.noarch.rpm"
RPM_HASH = "7a589302b0838c46cdbfc6cba3f5675af8e33147e420a74bf5686cdb7d67db1388e6bf49dd9bca8f449f5e69270ea541257cc9e46443f6076c34f5aceebee98d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-normflows \
python314-normflows \
python3dist-normflows"

RDEPENDS:${PN} += "python-abi \
python314-numpy \
python314-torch"

inherit rpm
