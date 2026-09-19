SUMMARY = "GNU implementation of ((t)ape (ar)chiver)"
DESCRIPTION = "GNU Tar is an archiver program. It is used to create and manipulate files \
that are actually collections of many other files; the program provides \
users with an organized and systematic method of controlling a large amount \
of data. Despite its name, that is an acronym of 'tape archiver', GNU Tar \
is able to direct its output to any available devices, files or other programs, \
it may as well access remote devices or files."
LICENSE = "GPL-3.0-or-later"

PV = "1.35"

RPM_NAME = "tar-1.35-10.1.aarch64.rpm"
RPM_HASH = "c6cfb124e662d13c13f345cffd6eaea32a507432a368cff87533945c5a89f15fab2b2759cfaed0d2ca9f033f4b37ead9fb1d70c127227ed41c807547fd6cf2e5"

RPROVIDES:${PN} += "/usr/bin/tar \
base-/bin/tar \
tar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libselinux.so.1"

inherit rpm
