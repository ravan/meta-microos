SUMMARY = "Peak detection utilities for 1D data"
DESCRIPTION = "This package provides utilities related to the detection of peaks on \
1D data. Includes functions to estimate baselines, finding the \
indexes of peaks in the data and performing Gaussian fitting or \
centroid computation to further increase the resolution of the peak \
detection."
LICENSE = "MIT"

PV = "1.3.4"

RPM_NAME = "python310-PeakUtils-1.3.4-2.2.noarch.rpm"
RPM_HASH = "a42d60c7d65b98ec164912bfce129f32406b27ca9ef664fc12820cde83057ed914d2b06221b0a2f12e1f474b0a7cc32e28bfc178fc3b42c7bd7cf3664165485f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-peakutils \
python310-PeakUtils \
python3dist-peakutils"

RDEPENDS:${PN} += "python-abi \
python310-numpy \
python310-scipy"

inherit rpm
