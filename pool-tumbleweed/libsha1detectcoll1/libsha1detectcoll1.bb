SUMMARY = "Library that can detect SHA-1 collisions"
DESCRIPTION = "This library was designed as near drop-in replacements for other sha1sum \
implementations. It will compute the SHA-1 hash of any given file and additionally \
will detect cryptanalytic collision attacks against SHA-1 present in each file. \
It is very fast and takes less than twice the amount of time as regular SHA-1."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "libsha1detectcoll1-1.0.3-5.9.aarch64.rpm"
RPM_HASH = "c6e57dca3906fbed30ffc4236a3bd98a54255cefa20b7103ad15cadb2f5dc30d00b4bef437f9cb5ca68c82c99acc6b7d54c0e8cdae503a19a78732ea994e7529"

RPROVIDES:${PN} += "libsha1detectcoll.so.1 \
libsha1detectcoll1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
