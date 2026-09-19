SUMMARY = "ROOT I/O in pure Python and Numpy"
DESCRIPTION = "Uproot is a reader and a writer of the ROOT file format using only Python and \
Numpy. Unlike the standard C++ ROOT implementation, Uproot is only an I/O \
library, primarily intended to stream data into machine learning libraries in \
Python. It uses Numpy to cast blocks of data from the ROOT file as Numpy \
arrays."
LICENSE = "BSD-3-Clause"

PV = "5.7.5"

RPM_NAME = "python314-uproot-5.7.5-1.1.noarch.rpm"
RPM_HASH = "41cd7ac1ba5c02085870c7436c91ca66aa5f6d77c2a5719a3b4ad2197ff4c4db97b0e46f88d2752ba542d56b0cfea593752164a82b52bd291677fccf24bfddd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-uproot \
python314-uproot \
python3dist-uproot"

RDEPENDS:${PN} += "python-abi \
python314-awkward \
python314-cramjam \
python314-fsspec \
python314-numpy \
python314-packaging \
python314-xxhash"

inherit rpm
