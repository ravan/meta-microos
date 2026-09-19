SUMMARY = "Library and program for creating and reading .zar files"
DESCRIPTION = "Program and library for handling ZArchive .zar files. ZArchive files are zstd-compressed file archives."
LICENSE = "MIT-0"

PV = "0.1.2+git20240721.b467f7a"

RPM_NAME = "ZArchive-0.1.2+git20240721.b467f7a-1.8.aarch64.rpm"
RPM_HASH = "41c43301ad9d211ef14fb1bde1e80ba9b9336930392016d680cda3b2b703fd1b1926426f3ae5211d7e368bc5e0355ed9428b475719ad56743b99eb6a0b93f963"

RPROVIDES:${PN} += "ZArchive"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libzarchive.so.0.1"

inherit rpm
