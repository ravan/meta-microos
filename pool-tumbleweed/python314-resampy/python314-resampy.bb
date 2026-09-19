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

RPM_NAME = "python314-resampy-0.4.3-2.9.noarch.rpm"
RPM_HASH = "cfb48e8906765b7fb4f8d39aacdab2c9f5aecd9766e003b8f776bdcbbdd3220319ca98de8c564568da6ea23b3e2f13e0b53cfcd378545cea142acf77c6e8d089"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-resampy \
python314-resampy \
python3dist-resampy"

RDEPENDS:${PN} += "python-abi \
python314-numba \
python314-numpy"

inherit rpm
