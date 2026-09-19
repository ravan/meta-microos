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

RPM_NAME = "python313-PyWavelets-1.9.0-1.4.aarch64.rpm"
RPM_HASH = "d4734454347470e021d5a3332637a042bb8845186798d8ede384fd39a3eaf352af947cbf9f03c3bb563c7ddbb9c7376cf2682e432357241a59bb17c0e2622335"

RPROVIDES:${PN} += "python3-PyWavelets \
python3-PyWavelets-doc \
python3-pywavelets \
python3.13dist-pywavelets \
python313-PyWavelets \
python313-PyWavelets-doc \
python313-pywavelets \
python3dist-pywavelets"

RDEPENDS:${PN} += "-python313-numpy >= 1.25 with python313-numpy < 3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python-abi"

inherit rpm
