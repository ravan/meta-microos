SUMMARY = "Image transformation, compression, and decompression codecs"
DESCRIPTION = "Imagecodecs is a Python library that provides block-oriented, in-memory buffer \
transformation, compression, and decompression functions for use in the \
tifffile, czifile, and other scientific imaging modules. \
 \
Decode and/or encode functions are implemented for Zlib (DEFLATE), GZIP, \
ZStandard (ZSTD), Blosc, Brotli, Snappy, LZMA, BZ2, LZ4, LZ4F, LZ4HC, LZW, LZF, \
ZFP, AEC, LERC, NPY, PNG, GIF, TIFF, WebP, JPEG 8-bit, JPEG 12-bit, Lossless \
JPEG (LJPEG, SOF3), JPEG 2000, JPEG LS, JPEG XR, JPEG XL, AVIF, PackBits, Packed \
Integers, Delta, XOR Delta, Floating Point Predictor, Bitorder reversal, \
Bitshuffle, and Float24 (24-bit floating point)."
LICENSE = "BSD-3-Clause"

PV = "2026.3.6"

RPM_NAME = "python313-imagecodecs-2026.3.6-2.8.aarch64.rpm"
RPM_HASH = "84976e556d3aafc854a02b505c58e7eb135ed8b60ec95090395a804be59991cf8999c91f94cb437291a50661f57875b99266baa7f4b6e6621d03b37b80b8f1e5"

RPROVIDES:${PN} += "python3-imagecodecs \
python3.13dist-imagecodecs \
python313-imagecodecs \
python3dist-imagecodecs"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libaec.so.0 \
libavif.so.16 \
libblosc2.so.9 \
libbrotlidec.so.1 \
libbrotlienc.so.1 \
libbz2.so.1 \
libc.so.6 \
libcharls.so.2 \
libdeflate.so.0 \
libgcc-s.so.1 \
libgif.so.7 \
libheif.so.1 \
libjpeg.so.8 \
libjpegxr.so.0 \
libjxl-threads.so.0.11 \
libjxl.so.0.11 \
libjxrglue.so.0 \
liblcms2.so.2 \
liblz4.so.1 \
liblzfse.so \
liblzhamdll.so \
liblzma.so.5 \
libm.so.6 \
libopenjp2.so.7 \
libopenjph.so.0.31 \
libpng16.so.16 \
libsnappy.so.1 \
libstdc++.so.6 \
libsz.so.2 \
libtiff.so.6 \
libwebp.so.7 \
libwebpdemux.so.2 \
libz-ng.so.2 \
libz.so.1 \
libzfp.so.1 \
libzopfli.so.1 \
libzstd.so.1 \
python-abi \
python313-numpy \
update-alternatives"

inherit rpm
