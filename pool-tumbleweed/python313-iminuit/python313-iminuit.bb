SUMMARY = "Python bindings for MINUIT2"
DESCRIPTION = "iminuit is a Python interface to the MINUIT2 C++ package. \
 \
It can be used as a general function minimization method, \
but is most commonly used for likelihood fits of models to data, \
and to get model parameter error estimates from likelihood profile analysis."
LICENSE = "MIT"

PV = "2.32.0"

RPM_NAME = "python313-iminuit-2.32.0-1.4.aarch64.rpm"
RPM_HASH = "a96ba86c65a91847981ed5e6dca3ab33e89da7ddf90d222f0c10388f372366c4239e9c0c183106fe00794b69605cb8ad7ce35d295bf03dc46ac21908f1d4344e"

RPROVIDES:${PN} += "python3-iminuit \
python3.13dist-iminuit \
python313-iminuit \
python3dist-iminuit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python313-numpy"

inherit rpm
