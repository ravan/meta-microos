SUMMARY = "Peak detection utilities for 1D data"
DESCRIPTION = "This package provides utilities related to the detection of peaks on \
1D data. Includes functions to estimate baselines, finding the \
indexes of peaks in the data and performing Gaussian fitting or \
centroid computation to further increase the resolution of the peak \
detection."
LICENSE = "MIT"

PV = "1.3.5"

RPM_NAME = "python314-PeakUtils-1.3.5-2.5.noarch.rpm"
RPM_HASH = "6621aca9fcd89f00a25adf346066d31b5d5c7953b67d1caeb68a7e4dd9e5a3b8062c19fab4fe0146f7f487abf764a5e4c07ec9062095fcadacb492a5c2ea19c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-peakutils \
python314-PeakUtils \
python3dist-peakutils"

RDEPENDS:${PN} += "python-abi \
python314-numpy \
python314-scipy"

inherit rpm
