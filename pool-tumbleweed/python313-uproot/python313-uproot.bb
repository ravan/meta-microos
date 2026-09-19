SUMMARY = "ROOT I/O in pure Python and Numpy"
DESCRIPTION = "Uproot is a reader and a writer of the ROOT file format using only Python and \
Numpy. Unlike the standard C++ ROOT implementation, Uproot is only an I/O \
library, primarily intended to stream data into machine learning libraries in \
Python. It uses Numpy to cast blocks of data from the ROOT file as Numpy \
arrays."
LICENSE = "BSD-3-Clause"

PV = "5.7.5"

RPM_NAME = "python313-uproot-5.7.5-1.1.noarch.rpm"
RPM_HASH = "c4adfdf59aa9be4565d1d1da8a89bfca615a7563b1fc64e92bae99c55777acf813b1fdbed280e765793a668d4e1d00b3dea5e9170f50bcdd9afdd646ebf80cbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uproot \
python3.13dist-uproot \
python313-uproot \
python3dist-uproot"

RDEPENDS:${PN} += "python-abi \
python313-awkward \
python313-cramjam \
python313-fsspec \
python313-numpy \
python313-packaging \
python313-xxhash"

inherit rpm
