SUMMARY = "Shared libraries for casacore, a suite of radio astronomy data"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing. \
 \
This package provides the shared libraries for casacore."
LICENSE = "LGPL-2.0-or-later"

PV = "3.8.0"

RPM_NAME = "libcasacore9-openmpi4-3.8.0-1.6.aarch64.rpm"
RPM_HASH = "5ded70124df25bc23421246b0b16a513c7632c303a58dfea5f08f18bf8f756e62be0c2e0f0861e522ecde8f7e4ea76ecaad47ca1784ca05fea1bc62e692d88d3"

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
libcasacore9-openmpi4"

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
