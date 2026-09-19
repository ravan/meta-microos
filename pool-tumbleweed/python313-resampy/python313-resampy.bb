SUMMARY = "Signal resampling in Python"
DESCRIPTION = "This package implements the band-limited sinc interpolation method \
in Python for sampling rate conversion as described by: \
 \
Smith, Julius O. Digital Audio Resampling Home Page Center for \
Computer Research in Music and Acoustics (CCRMA), Stanford \
University, 2015-02-23. Web published at \
http://ccrma.stanford.edu/~jos/resample/."
LICENSE = "ISC"

PV = "0.4.3"

RPM_NAME = "python313-resampy-0.4.3-2.9.noarch.rpm"
RPM_HASH = "57ffdf124ee87f0133bce3e14fafe4b193e45974b81b431d2e57db74ea7a276aa7c4ec409df0dd2982460ba01fec0381f8e045532390803808a823d09c0642c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-resampy \
python3.13dist-resampy \
python313-resampy \
python3dist-resampy"

RDEPENDS:${PN} += "python-abi \
python313-numba \
python313-numpy"

inherit rpm
