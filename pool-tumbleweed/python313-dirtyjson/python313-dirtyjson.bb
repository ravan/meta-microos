SUMMARY = "Python JSON decoder that can extract data from dirty input"
DESCRIPTION = "JSON decoder for Python that can extract data from dirty input."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "python313-dirtyjson-1.0.8-2.5.noarch.rpm"
RPM_HASH = "5752101d0d6e36794dc65278276b3987b1232cf836d2ced7a7ef88e047647e3ed9cbc332e5bf70e85888d4ee026bcffcd05cf7b276bbb0a66774b3cc67c77bb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dirtyjson \
python3.13dist-dirtyjson \
python313-dirtyjson \
python3dist-dirtyjson"

RDEPENDS:${PN} += "python-abi"

inherit rpm
