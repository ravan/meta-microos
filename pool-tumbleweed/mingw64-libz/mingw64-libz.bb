SUMMARY = "Zlib compression library"
DESCRIPTION = "zlib is a general-purpose lossless data-compression library, \
implementing an API for the DEFLATE algorithm, the latter of \
which is being used by, for example, gzip and the ZIP archive \
format. \
 \
Compatibility package."
LICENSE = "Zlib"

PV = "1.3.2"

RPM_NAME = "mingw64-libz-1.3.2-1.6.noarch.rpm"
RPM_HASH = "81a65a8117e6c5e3b6910dead35dcab3cb5154db88257de4e890e730edc9caaaa1b313fcbefeb5df9f82f10dd21c403d42e906549db9c13cb63566633a8a57fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-libz \
mingw64-libz.dll \
mingw64-zlib"

RDEPENDS:${PN} += ""

inherit rpm
