SUMMARY = "DSP and Comm package for Python"
DESCRIPTION = "This package is a collection of functions and classes to support \
signal processing and communications theory teaching and research. \
The foundation for this package is scipy.signal."
LICENSE = "BSD-2-Clause"

PV = "1.2.0"

RPM_NAME = "python313-scikit-dsp-comm-1.2.0-4.5.noarch.rpm"
RPM_HASH = "6df20aa2aa5cb4490b7e5d5f1577d9371a62beb32a568b2b6b2553b4e744c6a106aa32fcfc8c5854a2874d7b17804ad17950e26e6e8840ae74baa38d68721025"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scikit-dsp-comm \
python3.13dist-scikit-dsp-comm \
python313-scikit-dsp-comm \
python3dist-scikit-dsp-comm"

RDEPENDS:${PN} += "python-abi \
python313-matplotlib \
python313-numpy \
python313-scipy"

inherit rpm
