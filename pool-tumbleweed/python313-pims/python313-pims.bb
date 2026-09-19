SUMMARY = "Python Image Sequence"
DESCRIPTION = "Python Image Sequence"
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "python313-pims-0.7-2.2.noarch.rpm"
RPM_HASH = "31534146c467dfff28874266671a8a78d3776bfa08c4ea7bc812660ac195bc623a53ccb77bd9f27ea394d2298de054634bfa49f9854012bb232e3fd54debc5c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pims \
python3.13dist-pims \
python313-pims \
python3dist-pims"

RDEPENDS:${PN} += "python-abi \
python313-imageio \
python313-numpy \
python313-packaging \
python313-slicerator \
python313-tifffile"

inherit rpm
