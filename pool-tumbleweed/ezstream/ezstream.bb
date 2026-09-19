SUMMARY = "Icecast media streaming client"
DESCRIPTION = "Ezstream is a command line source client for Icecast media streaming servers. \
 \
The basic mode of operation streams media files or data from standard \
input without reencoding and thus requires little resources. It can \
use various external transcoders and stream the result. Additional \
features include scriptable playlist and metadata handling. \
 \
Supported media formats for streaming are MP3, Ogg Vorbis and Ogg \
Theora. Native metadata support includes MP3 (ID3v1 only) and Ogg, \
plus all those known to TagLib."
LICENSE = "GPL-2.0-only"

PV = "1.0.2"

RPM_NAME = "ezstream-1.0.2-2.6.aarch64.rpm"
RPM_HASH = "edd0163461379b362a77b50e653457677e34dc49441d76d087873d432e66611c241b0b388ec78397254fcd434966250f632e9b9e8e671cdf5255ecfaad04a19d"

RPROVIDES:${PN} += "ezstream"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libshout.so.3 \
libtag-c.so.2 \
libxml2.so.16"

inherit rpm
