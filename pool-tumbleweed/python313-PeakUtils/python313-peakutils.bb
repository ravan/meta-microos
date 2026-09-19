SUMMARY = "Peak detection utilities for 1D data"
DESCRIPTION = "This package provides utilities related to the detection of peaks on \
1D data. Includes functions to estimate baselines, finding the \
indexes of peaks in the data and performing Gaussian fitting or \
centroid computation to further increase the resolution of the peak \
detection."
LICENSE = "MIT"

PV = "1.3.5"

RPM_NAME = "python313-PeakUtils-1.3.5-2.5.noarch.rpm"
RPM_HASH = "02857c3a24a61e7c0f96937ae2e079fc77a424aca53bf5ae456e6bdc02f4e3552a60fa5e3bf50eec66ba5615359e30f01048b9b81f05feee7933081942ac700d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PeakUtils \
python3.13dist-peakutils \
python313-PeakUtils \
python3dist-peakutils"

RDEPENDS:${PN} += "python-abi \
python313-numpy \
python313-scipy"

inherit rpm
