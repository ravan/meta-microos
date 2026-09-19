SUMMARY = "Git extension for versioning large files"
DESCRIPTION = "Git Large File Storage (LFS) replaces large files such as audio samples, \
videos, datasets, and graphics with text pointers inside Git, while \
storing the file contents on a remote server."
LICENSE = "MIT"

PV = "3.8.0"

RPM_NAME = "git-lfs-3.8.0-1.1.aarch64.rpm"
RPM_HASH = "ef75bcd9d3f43bf42cae5a90fd89ab7a076e7dd5a550780f7c00d2a42ab9b096095605d7a0699d9302d195b7270dbf28380eaaaf38103373efda8c8aea4c7c19"

RPROVIDES:${PN} += "git-lfs"

RDEPENDS:${PN} += "/usr/bin/sh \
git-core \
libc.so.6"

inherit rpm
