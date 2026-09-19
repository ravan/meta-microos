SUMMARY = "Read and write image files in the Netpbm format"
DESCRIPTION = "Netpbmfile is a Python library to read and write image files in the Netpbm \
format."
LICENSE = "BSD-3-Clause"

PV = "2026.7.25"

RPM_NAME = "python313-netpbmfile-2026.7.25-1.1.noarch.rpm"
RPM_HASH = "d6612e9a7c07f17aa4a74750ffeb5a9408df66e0420d6148a4f7c61b956c53780f2d8bbc14b5890e3506c236efe5c5d173f7d225e6a4ec31597a2af8497cf587"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-netpbmfile \
python3.13dist-netpbmfile \
python313-netpbmfile \
python3dist-netpbmfile"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-matplotlib \
python313-numpy \
update-alternatives"

inherit rpm
