SUMMARY = "Lockfile object with timeouts and context manager"
DESCRIPTION = "A FileLock class that implements a context manager with timeouts on top \
of zc.lockfile, an excellent, cross-platorm implementation of file locking."
LICENSE = "MIT"

PV = "2.3"

RPM_NAME = "python313-yg.lockfile-2.3-2.5.noarch.rpm"
RPM_HASH = "532de32c2450c44ef165f950f19a7406993a23c57175423d7223d02814a6e53cc5582fed4194996b277ff42bde36177a457dfe3234fd76d204c95dadd26283c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yg.lockfile \
python3.13dist-yg.lockfile \
python313-yg.lockfile \
python3dist-yg.lockfile"

RDEPENDS:${PN} += "python-abi \
python313-jaraco.functools \
python313-tempora \
python313-zc.lockfile"

inherit rpm
