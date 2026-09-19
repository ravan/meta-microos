SUMMARY = "NFS-safe file locking with timeouts for POSIX and Windows"
DESCRIPTION = "NFS-safe file locking with timeouts for POSIX and Windows."
LICENSE = "Apache-2.0"

PV = "9.1.0"

RPM_NAME = "python314-flufl.lock-9.1.0-1.2.noarch.rpm"
RPM_HASH = "a700da294f609deea8d41fb011de42eb24b824298bd2f7d69d6c37762265c413c1fca87ce80e45d496b1b0c611234b132c8914d6752434c2d7d88b1289e1b0a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flufl.lock \
python314-flufl.lock \
python3dist-flufl.lock"

RDEPENDS:${PN} += "python-abi \
python314-atpublic \
python314-psutil"

inherit rpm
