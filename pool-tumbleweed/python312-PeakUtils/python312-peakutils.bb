SUMMARY = "Peak detection utilities for 1D data"
DESCRIPTION = "This package provides utilities related to the detection of peaks on \
1D data. Includes functions to estimate baselines, finding the \
indexes of peaks in the data and performing Gaussian fitting or \
centroid computation to further increase the resolution of the peak \
detection."
LICENSE = "MIT"

PV = "1.3.4"

RPM_NAME = "python312-PeakUtils-1.3.4-2.2.noarch.rpm"
RPM_HASH = "f7479e05efbc5a15a1874eeb810b25c708f7c4b09d9d58dfc824a9a9309912c1fb83900b7bc41d89aa5bc9651cb2d74894b73de9a081ec22b22da1142900df3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-peakutils \
python312-PeakUtils \
python3dist-peakutils"

RDEPENDS:${PN} += "python-abi \
python312-numpy \
python312-scipy"

inherit rpm
