SUMMARY = "Python bindings for libgit2"
DESCRIPTION = "Bindings for libgit2, a linkable C library for the Git version-control system."
LICENSE = "GPL-2.0-only"

PV = "1.19.3"

RPM_NAME = "python313-pygit2-1.19.3-1.3.aarch64.rpm"
RPM_HASH = "4a004348ae769ca25d865623a93288fdcece4ce1e886cb98c84558ba6d144e36024ef9aede4573dbdc0429a3b83cc5d7204646f787efed52465c0cfc0102cd62"

RPROVIDES:${PN} += "python3-pygit2 \
python3.13dist-pygit2 \
python313-pygit2 \
python3dist-pygit2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgit2.so.1.9 \
python-abi \
python313-cached-property \
python313-cffi"

inherit rpm
