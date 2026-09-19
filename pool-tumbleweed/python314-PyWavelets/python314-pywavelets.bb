SUMMARY = "PyWavelets is a Python wavelet transforms module"
DESCRIPTION = "PyWavelets is a Python wavelet transforms module that can do: \
 \
  * 1D and 2D Forward and Inverse Discrete Wavelet Transform (DWT and IDWT) \
  * 1D and 2D Stationary Wavelet Transform (Undecimated Wavelet Transform) \
  * 1D and 2D Wavelet Packet decomposition and reconstruction \
  * Computing Approximations of wavelet and scaling functions \
  * Over seventy built-in wavelet filters and support for custom wavelets \
  * Single and double precision calculations \
  * Results compatibility with Matlab Wavelet Toolbox"
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "python314-PyWavelets-1.9.0-1.4.aarch64.rpm"
RPM_HASH = "4cdb4e060563b08ea8cc54932d62f194a4b708f72eca0b0e9e3fbbe5489a60821781f4b95ff2706e285bdbb42873149cc7dc30cf3cf1390821324cc5798ad9c5"

RPROVIDES:${PN} += "python3.14dist-pywavelets \
python314-PyWavelets \
python314-PyWavelets-doc \
python314-pywavelets \
python3dist-pywavelets"

RDEPENDS:${PN} += "-python314-numpy >= 1.25 with python314-numpy < 3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python-abi"

inherit rpm
