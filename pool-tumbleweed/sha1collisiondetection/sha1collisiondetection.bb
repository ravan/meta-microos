SUMMARY = "Detection of SHA-1 collisions"
DESCRIPTION = "This command line tool was designed as near drop-in replacements for other sha1sum \
implementations. It will compute the SHA-1 hash of any given file and additionally \
will detect cryptanalytic collision attacks against SHA-1 present in each file. \
It is very fast and takes less than twice the amount of time as regular SHA-1."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "sha1collisiondetection-1.0.3-5.9.aarch64.rpm"
RPM_HASH = "6cf561735791e1bcbc536cc006a6be379b9c301672c78b5a9fd6d70c47b59fbe775ec74818bdfd41e5b88f6159a73538948ebcd90b754be1d3c4468e2bc48297"

RPROVIDES:${PN} += "sha1collisiondetection"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsha1detectcoll.so.1"

inherit rpm
