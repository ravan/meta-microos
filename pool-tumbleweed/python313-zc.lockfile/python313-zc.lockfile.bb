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

RPM_NAME = "python313-zc.lockfile-4.0-1.1.noarch.rpm"
RPM_HASH = "98fdd3d7f86531c85c230ff81492567f081e983990b7141bdaee625fab3d5f01525a16d52ed078e849f9eecac072acf108a4b4814cb96d7d0e40f2cc2b506b83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zc-lockfile \
python3-zc.lockfile \
python3.13dist-zc.lockfile \
python313-zc-lockfile \
python313-zc.lockfile \
python3dist-zc.lockfile"

RDEPENDS:${PN} += "python-abi \
python313-setuptools"

inherit rpm
