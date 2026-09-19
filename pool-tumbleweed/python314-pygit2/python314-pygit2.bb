SUMMARY = "Python bindings for libgit2"
DESCRIPTION = "Bindings for libgit2, a linkable C library for the Git version-control system."
LICENSE = "GPL-2.0-only"

PV = "1.19.3"

RPM_NAME = "python314-pygit2-1.19.3-1.3.aarch64.rpm"
RPM_HASH = "e5a011e15c272c1adcc3120b214ea44220933e564bbd85a4ddc54f20b481ba295384430a4695a029a7a8951e7b1310e30de020be09308f1619463e90fbb2bd1d"

RPROVIDES:${PN} += "python3.14dist-pygit2 \
python314-pygit2 \
python3dist-pygit2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgit2.so.1.9 \
python-abi \
python314-cached-property \
python314-cffi"

inherit rpm
