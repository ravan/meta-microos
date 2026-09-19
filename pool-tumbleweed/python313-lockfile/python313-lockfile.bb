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

RPM_NAME = "python313-lockfile-0.12.2-4.10.noarch.rpm"
RPM_HASH = "48cbbebc3b081e87e8a6c674498331bbdc662a39cfb27855933ca730708a95598d4a584548c052f370890f44c221abddc3f9a4768f74c2863910114052675459"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lockfile \
python3.13dist-lockfile \
python313-lockfile \
python3dist-lockfile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
