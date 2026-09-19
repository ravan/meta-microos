SUMMARY = "Basic inter-process locks"
DESCRIPTION = "The zc.lockfile package provides a basic portable implementation of \
interprocess locks using lock files. The purpose if not specifically to lock \
files, but to simply provide locks with an implementation based on file-locking \
primitives. Of course, these locks could be used to mediate access to other \
files. For example, the ZODB file storage implementation uses file locks to \
mediate access to file-storage database files. The database files and lock file \
files are separate files."
LICENSE = "ZPL-2.1"

PV = "4.0"

RPM_NAME = "python314-zc.lockfile-4.0-1.1.noarch.rpm"
RPM_HASH = "463321030d7e04f84d35609dc34c144b19e6c676c104a334a7b888792686a49baa3cec0bcaac7334f2aed9bd971a6037dd0d5b48c916363b16dfb8c648acae43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-zc.lockfile \
python314-zc-lockfile \
python314-zc.lockfile \
python3dist-zc.lockfile"

RDEPENDS:${PN} += "python-abi \
python314-setuptools"

inherit rpm
