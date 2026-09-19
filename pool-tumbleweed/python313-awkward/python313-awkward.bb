SUMMARY = "Manipulate arrays of complex data structures as easily as Numpy"
DESCRIPTION = "Awkward Array is a library for nested, variable-sized data, including \
arbitrary-length lists, records, mixed types, and missing data, using \
NumPy-like idioms. \
 \
Arrays are dynamically typed, but operations on them are compiled and fast. \
Their behavior coincides with NumPy when array dimensions are regular and \
generalizes when they're not."
LICENSE = "BSD-3-Clause"

PV = "2.9.1"

RPM_NAME = "python313-awkward-2.9.1-1.3.aarch64.rpm"
RPM_HASH = "d11924d14bb49b05a832090e6e22bf70093a2dc0d52e9fd2dd044a348fdc905e009ef1cd839a366dab3206f16c5e51777875b2fa64de310bfec0b5ff0f944727"

RPROVIDES:${PN} += "python3-awkward \
python3.13dist-awkward \
python313-awkward \
python3dist-awkward"

RDEPENDS:${PN} += "python-abi \
python313-awkward-cpp \
python313-fsspec \
python313-numpy \
python313-packaging"

inherit rpm
