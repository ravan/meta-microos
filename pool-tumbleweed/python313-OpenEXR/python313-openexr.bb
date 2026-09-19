SUMMARY = "Python bindings for the OpenEXR image file format"
DESCRIPTION = "This package provides python bindings for openexr image file format."
LICENSE = "BSD-3-Clause"

PV = "3.4.13"

RPM_NAME = "python313-OpenEXR-3.4.13-1.1.aarch64.rpm"
RPM_HASH = "b2f2b392b26ae5391f784643c6361f0238ec3c343c2fc416d913fb57775e05b588a06fd459aec9adf3df382ffdbc40dfc2e3c65a0fa66f2c831323384ec1e3c7"

RPROVIDES:${PN} += "python3-OpenEXR \
python3.13dist-openexr \
python313-OpenEXR \
python3dist-openexr"

RDEPENDS:${PN} += "libImath-3-2.so.30 \
libc.so.6 \
libdeflate.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libopenjph.so.0.31 \
libstdc++.so.6 \
python-abi \
python313-numpy"

inherit rpm
