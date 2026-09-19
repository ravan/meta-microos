SUMMARY = "Compression filters for h5py"
DESCRIPTION = "hdf5plugin provides HDF5 compression filters \
(namely: Blosc, Blosc2, BitShuffle, BZip2, FciDecomp, LZ4, SZ, SZ3, Zfp, ZStd) \
and makes them usable from h5py."
LICENSE = "BSD-2-Clause & MIT & BSD-3-Clause & CC-BY-3.0 & Zlib"

PV = "6.0.0"

RPM_NAME = "python313-hdf5plugin-6.0.0-2.1.aarch64.rpm"
RPM_HASH = "18dfc2736d3ffc188f1a60d998baddad4eb72e7a4021f9ddb9251f8cdfdae2625e5adc5acc0d9251a563a7c9cf285102ad936159fff7d9a69cf806094269fb86"

RPROVIDES:${PN} += "libh5blosc.so \
libh5blosc2.so \
libh5bshuf.so \
libh5bzip2.so \
libh5fcidecomp.so \
libh5lz4.so \
libh5sperr.so \
libh5sz.so \
libh5sz3.so \
libh5zfp.so \
libh5zstd.so \
python3-hdf5plugin \
python3.13dist-hdf5plugin \
python313-hdf5plugin \
python3dist-hdf5plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblosc.so.1 \
libblosc2.so.7 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblz4.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1 \
python-abi \
python313-h5py"

inherit rpm
