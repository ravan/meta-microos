SUMMARY = "Modeling and fitting package for scientific data analysis"
DESCRIPTION = "Sherpa is the CIAO modeling and fitting application. It enables the \
user to construct models from definitions and fit those models to \
data, using a variety of statistics and optimization methods."
LICENSE = "GPL-3.0-only"

PV = "4.17.1"

RPM_NAME = "python313-sherpa-4.17.1-1.6.aarch64.rpm"
RPM_HASH = "d87f33f0a128706b46379564affe978f2c47b527ca46450f0a8a89f7d341dd48c8717932ed24e2e0e51f5453a51c0ddc19c062ce678216399857e1ff87a94711"

RPROVIDES:${PN} += "python3-sherpa \
python3.13dist-sherpa \
python313-sherpa \
python3dist-sherpa"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwcs.so.8 \
python-abi \
python313-numpy \
update-alternatives"

inherit rpm
