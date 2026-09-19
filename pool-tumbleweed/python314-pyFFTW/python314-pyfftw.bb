SUMMARY = "A pythonic wrapper around FFTW, the FFT library"
DESCRIPTION = "pyFFTW is a pythonic wrapper around the FFTW libary. \
An interface for all the possible transforms that FFTW can perform is provided. \
 \
Both the complex DFT and the real DFT are supported, as well as arbitrary \
axes of abitrary shaped and strided arrays, which makes it almost \
feature equivalent to standard and real FFT functions of ``numpy.fft`` \
(indeed, it supports the ``clongdouble`` dtype which ``numpy.fft`` does not). \
 \
Operating FFTW in multithreaded mode is supported. \
 \
A comprehensive unittest suite can be found with the source on the github \
repository."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "0.15.1"

RPM_NAME = "python314-pyFFTW-0.15.1-1.5.aarch64.rpm"
RPM_HASH = "4d80f831bcfdfa53640eed7b55df65da544283e9c1f8339501d62237fbb7af5879dbe8b588c4e754d2662af7becd8dc1ce36d2bdbfc4b780d26519cff4e89345"

RPROVIDES:${PN} += "python3.14dist-pyfftw \
python314-pyFFTW \
python3dist-pyfftw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3-threads.so.3 \
libfftw3.so.3 \
libfftw3f-threads.so.3 \
libfftw3f.so.3 \
libfftw3l-threads.so.3 \
libfftw3l.so.3 \
python-abi \
python314-dask \
python314-numpy \
python314-scipy"

inherit rpm
