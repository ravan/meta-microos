SUMMARY = "GDAL Python module"
DESCRIPTION = "The GDAL python modules provide support to handle multiple GIS file formats."
LICENSE = "BSD-3-Clause & MIT & LicenseRef-SUSE-Public-Domain"

PV = "3.13.3"

RPM_NAME = "python313-GDAL-3.13.3-1.1.aarch64.rpm"
RPM_HASH = "153bec5ceabd5e4d99c0cb50fea5304ebf9e2a7ea0e45909c35d476924dd41ba0048d6b05b7e8a34f33aab17f6044046cffde2d62231f39310ad747eeac6292e"

RPROVIDES:${PN} += "python3-GDAL \
python3-gdal \
python3.13dist-gdal \
python313-GDAL \
python313-gdal \
python3dist-gdal"

RDEPENDS:${PN} += "gdal \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdal.so.39 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
