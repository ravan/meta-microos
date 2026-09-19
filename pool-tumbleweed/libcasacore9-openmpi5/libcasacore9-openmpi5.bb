SUMMARY = "Shared libraries for casacore, a suite of radio astronomy data"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing. \
 \
This package provides the shared libraries for casacore."
LICENSE = "LGPL-2.0-or-later"

PV = "3.8.0"

RPM_NAME = "libcasacore9-openmpi5-3.8.0-1.5.aarch64.rpm"
RPM_HASH = "0cc95ab46fbe7e082a7306b8b769a76233578077116f8180b41792674acee111c7bcf5484f000989be5f506b025edee0c1ae1a8b92ce7df3da79e1037f894388"

RPROVIDES:${PN} += "libcasa-casa.so.9 \
libcasa-coordinates.so.9 \
libcasa-derivedmscal.so.9 \
libcasa-fits.so.9 \
libcasa-images.so.9 \
libcasa-lattices.so.9 \
libcasa-meas.so.9 \
libcasa-measures.so.9 \
libcasa-mirlib.so.9 \
libcasa-ms.so.9 \
libcasa-msfits.so.9 \
libcasa-python3.so.9 \
libcasa-scimath-f.so.9 \
libcasa-scimath.so.9 \
libcasa-tables.so.9 \
libcasacore9-openmpi5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-python-py3.so.1.91.0 \
libc.so.6 \
libcfitsio.so.10 \
libfftw3-threads.so.3 \
libfftw3.so.3 \
libfftw3f-threads.so.3 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libgfortran.so.5 \
libgomp.so.1 \
libgsl.so.28 \
libgslcblas.so.0 \
libhdf5.so.310 \
liblapack.so.3 \
libm.so.6 \
libmpi.so.40 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
libwcs.so.8"

inherit rpm
