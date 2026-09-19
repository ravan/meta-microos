SUMMARY = "A python module that provides a simple interface to FUSE"
DESCRIPTION = "fusepy is a Python module that provides a simple interface to FUSE. It makes \
the implementation of userspace file systems based on FUSE and python \
possible."
LICENSE = "ISC"

PV = "3.0.1"

RPM_NAME = "python313-fusepy-3.0.1-3.5.noarch.rpm"
RPM_HASH = "7cc104bc65baf438dfdc287b8cb0536c42584b239bbd296415d05da47f8d0dfa8e15158fd065b40dcb9a660ca57d745741468b5d4f042f15e765c39ed146b3c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fusepy \
python3.13dist-fusepy \
python313-fusepy \
python3dist-fusepy"

RDEPENDS:${PN} += "libfuse2 \
python-abi"

inherit rpm
