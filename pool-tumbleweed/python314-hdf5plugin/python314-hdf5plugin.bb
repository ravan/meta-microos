SUMMARY = "Compression filters for h5py"
DESCRIPTION = "hdf5plugin provides HDF5 compression filters \
(namely: Blosc, Blosc2, BitShuffle, BZip2, FciDecomp, LZ4, SZ, SZ3, Zfp, ZStd) \
and makes them usable from h5py."
LICENSE = "BSD-2-Clause & MIT & BSD-3-Clause & CC-BY-3.0 & Zlib"

PV = "6.0.0"

RPM_NAME = "python314-hdf5plugin-6.0.0-2.1.aarch64.rpm"
RPM_HASH = "0cfb53a6f6a0d6572f0b78b1a1712eb171c4d448705243ad9177fdff7b889fb54b4f6c441864cad24083fb6c4f75b817b988c35c52125a3ece4e7584ab82b9b9"

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
python3.14dist-hdf5plugin \
python314-hdf5plugin \
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
python314-h5py"

inherit rpm
