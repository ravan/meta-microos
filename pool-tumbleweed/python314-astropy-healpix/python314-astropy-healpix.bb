SUMMARY = "HEALPix for Astropy"
DESCRIPTION = "This is a BSD-licensed HEALPix package developed by the Astropy project \
and based on C code written by Dustin Lang in astrometry.net."
LICENSE = "BSD-3-Clause"

PV = "1.1.3"

RPM_NAME = "python314-astropy-healpix-1.1.3-1.6.aarch64.rpm"
RPM_HASH = "c18041a591533d9d6fed490ebd67ecf57cf250661ae7a6e2524cd1868e689d0ff6b20aca309e05b9765795b17ef6dff3b42c3a0735c1ac4f83de9ab7776d4818"

RPROVIDES:${PN} += "python3.14dist-astropy-healpix \
python314-astropy-healpix \
python3dist-astropy-healpix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-astropy \
python314-numpy"

inherit rpm
