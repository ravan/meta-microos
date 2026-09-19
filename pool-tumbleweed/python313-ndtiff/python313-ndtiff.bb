SUMMARY = "Python libraries for NDTiff datasets"
DESCRIPTION = "Python libraries for NDTiff datasets"
LICENSE = "BSD-3-Clause"

PV = "3.1.0"

RPM_NAME = "python313-ndtiff-3.1.0-2.2.noarch.rpm"
RPM_HASH = "4c13842afc9adad9d0f7ff596abf0cc405135b3b0ef54d393d8afabc0bb0ff7a86ffd0c4b34458cbb10cd5bc4f7a5bb34bac6cfd4b3b57aa238ab94bc2ed6a29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ndtiff \
python3.13dist-ndtiff \
python313-ndtiff \
python3dist-ndtiff"

RDEPENDS:${PN} += "python-abi \
python313-dask-array \
python313-numpy \
python313-sortedcontainers"

inherit rpm
