SUMMARY = "Development files for"
DESCRIPTION = "This library was designed as near drop-in replacements for other sha1sum \
implementations. It will compute the SHA-1 hash of any given file and additionally \
will detect cryptanalytic collision attacks against SHA-1 present in each file. \
It is very fast and takes less than twice the amount of time as regular SHA-1."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "libsha1detectcoll-devel-1.0.3-5.9.aarch64.rpm"
RPM_HASH = "004a54ef61a4f8b54dc2474c1fbdc6443c73c292fa9a92fb896ef97b99f4fdcf02dab0caf0c7b668b6429785e73d3d9baaf39fd8b0d4f0476324fdb2defb6795"

RPROVIDES:${PN} += "libsha1detectcoll-devel"

RDEPENDS:${PN} += "libsha1detectcoll1"

inherit rpm
