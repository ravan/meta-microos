SUMMARY = "An expect-like extension for the Paramiko SSH library"
DESCRIPTION = "Paramiko Expect provides an expect-like extension for the Paramiko SSH library \
which allows scripts to fully interact with hosts via a true SSH \
connection. \
 \
The class is constructed with an SSH Client object (this will likely be \
extended to support a transport in future for more flexibility)."
LICENSE = "MIT"

PV = "0.3.5"

RPM_NAME = "python314-paramiko-expect-0.3.5-2.5.noarch.rpm"
RPM_HASH = "25c3e339d7c7bd65c77740b026dfddc84963b997f3311082632cbe00143757adb7e721651c6b1b4e45d1a5e511ecc99e1bb861e3221521c1cacacc0e43198ae3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-paramiko-expect \
python314-paramiko-expect \
python3dist-paramiko-expect"

RDEPENDS:${PN} += "python-abi \
python314-paramiko"

inherit rpm
