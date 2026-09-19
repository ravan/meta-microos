SUMMARY = "The Vorbis General Audio Compression Codec"
DESCRIPTION = "Vorbis is a fully open, nonproprietary, patent-and-royalty-free, and \
general-purpose compressed audio format for audio and music at fixed \
and variable bit rates from 16 to 128 kbps/channel. \
 \
The native bitstream format of Vorbis is libogg (Ogg). Alternatively, \
libmatroska (matroska) can also be used."
LICENSE = "BSD-3-Clause"

PV = "1.3.7"

RPM_NAME = "libvorbis0-1.3.7-5.10.aarch64.rpm"
RPM_HASH = "95f11d5e6d8e25235f7e12b7cec9c764d8796b3e8ef1dbc1ad5f10d1fefcd02a42ac7bee382d0fb8e2602f16dbc42f979826504178a18575fe3fbab2636de6b3"

RPROVIDES:${PN} += "libvorbis.so.0 \
libvorbis0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmvec.so.1 \
libogg.so.0"

inherit rpm
