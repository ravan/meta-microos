SUMMARY = "A C++ library for resampling audio signals"
DESCRIPTION = "Zita resampler is a C++ library for resampling audio signals. It is \
designed to be used within a real-time processing context, to be \
fast, and to provide high-quality sample rate conversion."
LICENSE = "GPL-3.0-or-later"

PV = "1.11.2"

RPM_NAME = "libzita-resampler1-1.11.2-2.9.aarch64.rpm"
RPM_HASH = "1532249cc49fb8e651edca13afb4617b3bc5140afc11a121239fa1fc7559a740435610c4eea820eba19fc0249986e596bcb2cef4b63f7c5336d802d67828357b"

RPROVIDES:${PN} += "libzita-resampler.so.1 \
libzita-resampler1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
