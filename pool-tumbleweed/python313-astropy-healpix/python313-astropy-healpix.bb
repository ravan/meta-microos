SUMMARY = "HEALPix for Astropy"
DESCRIPTION = "This is a BSD-licensed HEALPix package developed by the Astropy project \
and based on C code written by Dustin Lang in astrometry.net."
LICENSE = "BSD-3-Clause"

PV = "1.1.3"

RPM_NAME = "python313-astropy-healpix-1.1.3-1.6.aarch64.rpm"
RPM_HASH = "2a6fef6cbd04a51bbd5c9b74d45e48475908da8d10b36684a6daba7bb053ae7b77a0a95951db7fd535234d2ac126ceffb4f8645b5e4621f1fe9ed0057da16fd9"

RPROVIDES:${PN} += "python3-astropy-healpix \
python3.13dist-astropy-healpix \
python313-astropy-healpix \
python3dist-astropy-healpix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-astropy \
python313-numpy"

inherit rpm
