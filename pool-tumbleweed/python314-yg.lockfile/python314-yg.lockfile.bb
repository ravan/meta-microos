SUMMARY = "Lockfile object with timeouts and context manager"
DESCRIPTION = "A FileLock class that implements a context manager with timeouts on top \
of zc.lockfile, an excellent, cross-platorm implementation of file locking."
LICENSE = "MIT"

PV = "2.3"

RPM_NAME = "python314-yg.lockfile-2.3-2.5.noarch.rpm"
RPM_HASH = "1df9e8730e8be2d4983e8e2d4d79d8375695ae02eeeb0d96451e03ffa800a5f8d57eccb85b188a0da687a59f0481e914b56b587669ec47c788044059bda62ff9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-yg.lockfile \
python314-yg.lockfile \
python3dist-yg.lockfile"

RDEPENDS:${PN} += "python-abi \
python314-jaraco.functools \
python314-tempora \
python314-zc.lockfile"

inherit rpm
