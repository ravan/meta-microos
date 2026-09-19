SUMMARY = "Peak detection utilities for 1D data"
DESCRIPTION = "This package provides utilities related to the detection of peaks on \
1D data. Includes functions to estimate baselines, finding the \
indexes of peaks in the data and performing Gaussian fitting or \
centroid computation to further increase the resolution of the peak \
detection."
LICENSE = "MIT"

PV = "1.3.4"

RPM_NAME = "python311-PeakUtils-1.3.4-2.2.noarch.rpm"
RPM_HASH = "d5b6a91511eed0decfdf37c664b753ca7c38e9d022fe640af2bed4be118b39c0829b995f35e0112bc17e6399ddb753af203cbab999601fd339bc9ae9b4252919"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PeakUtils \
python3.11dist-peakutils \
python311-PeakUtils \
python3dist-peakutils"

RDEPENDS:${PN} += "python-abi \
python311-numpy \
python311-scipy"

inherit rpm
