SUMMARY = "Icecast/Shoutcast Stream Grabber"
DESCRIPTION = "fIcy is a command line icecast/shoutcast stream grabber. It will work \
with any ICY-compatible stream and allows to either save the stream to \
user-customizable files or pipe the output to a media player, or both."
LICENSE = "LGPL-2.1+"

PV = "1.0.21"

RPM_NAME = "fIcy-1.0.21-2.9.aarch64.rpm"
RPM_HASH = "730ffd9ca2a23b37940ff14b7c338bd4938fc4c07f090da6f8a1744c4c7dc86bb10efcad9a56e4c39beafc1127a51bdd3c236d954d8ac869cc3c20e61c042f0e"

RPROVIDES:${PN} += "fIcy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
