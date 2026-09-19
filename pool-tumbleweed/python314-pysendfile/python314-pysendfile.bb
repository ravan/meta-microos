SUMMARY = "A Python interface to sendfile(2)"
DESCRIPTION = "A python interface to sendfile(2) system call."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python314-pysendfile-2.0.1-4.14.aarch64.rpm"
RPM_HASH = "66db6f6a6acbb602a92bd04572880d466d72058b24fd1c1025d378f307d2d333b79ccfa49e2d5d1f1a4025a620ef2d3ba58988039426a0047e6efa123dcf324a"

RPROVIDES:${PN} += "python3.14dist-pysendfile \
python314-pysendfile \
python3dist-pysendfile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
