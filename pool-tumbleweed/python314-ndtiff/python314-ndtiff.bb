SUMMARY = "Python libraries for NDTiff datasets"
DESCRIPTION = "Python libraries for NDTiff datasets"
LICENSE = "BSD-3-Clause"

PV = "3.1.0"

RPM_NAME = "python314-ndtiff-3.1.0-2.2.noarch.rpm"
RPM_HASH = "6b5594de795366ccceaddf42d233ce27a55155de166e64717078986782512a5fb72383fa5288d5738180c493ccce3ae3173d6741c20f98fccd35eec6af1fe937"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ndtiff \
python314-ndtiff \
python3dist-ndtiff"

RDEPENDS:${PN} += "python-abi \
python314-dask-array \
python314-numpy \
python314-sortedcontainers"

inherit rpm
