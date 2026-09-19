SUMMARY = "Static library for zlib"
DESCRIPTION = "zlib is a general-purpose lossless data-compression library, \
implementing an API for the DEFLATE algorithm, the latter of \
which is being used by, for example, gzip and the ZIP archive \
format. \
 \
This subpackage contains the static version of the library \
used for development."
LICENSE = "Zlib"

PV = "1.3.1"

RPM_NAME = "zlib-devel-static-1.3.1-3.3.aarch64.rpm"
RPM_HASH = "ba93e82a057f1b4f3a176d7cba8637b3f6016dfea200245a7767df24df20aab0af27169babecc20b5840ede4c1c2eaa3547d2d7766b1615529f437c2fba150c1"

RPROVIDES:${PN} += "zlib-devel-/usr/lib64/libz.a \
zlib-devel-static"

RDEPENDS:${PN} += "zlib-devel"

inherit rpm
