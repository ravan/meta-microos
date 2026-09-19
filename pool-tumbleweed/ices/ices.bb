SUMMARY = "Source Client for icecast Streaming Server"
DESCRIPTION = "IceS is a source client for a streaming server. The purpose of this \
client is to provide an audio stream to a streaming server such that \
one or more listeners can access the stream.  With this layout, this \
source client can be situated remotely from the icecast server."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.3"

RPM_NAME = "ices-2.0.3-2.10.aarch64.rpm"
RPM_HASH = "0013234ffcda577d493d473c66d3eb668482a8e74d76bc8542ca86b0efbd3e9a10c01398cee76e387f74c1f9e266a569320e7159cc40218e3d807d6b057ee93d"

RPROVIDES:${PN} += "ices"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libm.so.6 \
libogg.so.0 \
libshout.so.3 \
libvorbis.so.0 \
libvorbisenc.so.2 \
libxml2.so.16"

inherit rpm
