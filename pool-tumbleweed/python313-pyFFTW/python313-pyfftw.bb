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

RPM_NAME = "python313-pyFFTW-0.15.1-1.5.aarch64.rpm"
RPM_HASH = "16fdffd231128598dac106a48d4a0d034bff56211be78f162f78870c253cad9147732b5dcf60ff12a03e577d9bbef172645907dd9e658f0a6c5021e71ea06a2a"

RPROVIDES:${PN} += "python3-pyFFTW \
python3.13dist-pyfftw \
python313-pyFFTW \
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
python313-dask \
python313-numpy \
python313-scipy"

inherit rpm
