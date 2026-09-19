SUMMARY = "Platform-independent file locking module"
DESCRIPTION = "The lockfile package exports a LockFile class which provides a simple API for \
locking files.  Unlike the Windows msvcrt.locking function, the fcntl.lockf \
and flock functions, and the deprecated posixfile module, the API is \
identical across both Unix (including Linux and Mac) and Windows platforms. \
The lock mechanism relies on the atomic nature of the link (on Unix) and \
mkdir (on Windows) system calls.  An implementation based on SQLite is also \
provided, more as a demonstration of the possibilities it provides than as \
production-quality code."
LICENSE = "MIT"

PV = "0.12.2"

RPM_NAME = "python314-lockfile-0.12.2-4.10.noarch.rpm"
RPM_HASH = "7768768e002514cebe1478430a942609b8466bad9eea4ecbe33a30a341ccef16ba53c4c2c342f6c3345a39e66846069287b392965ccfb1bf19af2d0babc3233c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-lockfile \
python314-lockfile \
python3dist-lockfile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
