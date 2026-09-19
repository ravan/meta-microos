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

RPM_NAME = "python314-awkward-2.9.1-1.3.aarch64.rpm"
RPM_HASH = "a1211ee8f1ad4b1a28d054d97565ac71c9c6b6f4178228cbeb3967ff4e5e8817285d79c14a2817c4d5cec2e479639d7edd9121fa187d672109e11c3cb8e21ac7"

RPROVIDES:${PN} += "python3.14dist-awkward \
python314-awkward \
python3dist-awkward"

RDEPENDS:${PN} += "python-abi \
python314-awkward-cpp \
python314-fsspec \
python314-numpy \
python314-packaging"

inherit rpm
