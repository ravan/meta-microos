SUMMARY = "gzip backed by the ISA-L deflate library"
DESCRIPTION = "igzip compresses and decompresses files similar to gzip using the \
ISA-L deflate library. \
 \
Output .gz files are compatible with gzip and RFC 1952."
LICENSE = "BSD-3-Clause"

PV = "2.32.1"

RPM_NAME = "igzip-2.32.1-1.3.aarch64.rpm"
RPM_HASH = "dc723c3cbd3cec1a4346286a05f7fd20ab196a40ef06d176079993d3e722a1d1d4bf90c86d0c7e61048a517e9d9a2804c0576fc1e1ea675f11d7696675240511"

RPROVIDES:${PN} += "igzip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libisal.so.2"

inherit rpm
