SUMMARY = "NFS-safe file locking with timeouts for POSIX and Windows"
DESCRIPTION = "NFS-safe file locking with timeouts for POSIX and Windows."
LICENSE = "Apache-2.0"

PV = "9.1.0"

RPM_NAME = "python313-flufl.lock-9.1.0-1.2.noarch.rpm"
RPM_HASH = "3d5510fe63381b9e8a5e60232f45dabb9abd0f2e4cae4a2b7151478b7ae1898a88271f2cd0803334ec4592763db9def0052b49cb035de061982d984de65b12a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flufl.lock \
python3.13dist-flufl.lock \
python313-flufl.lock \
python3dist-flufl.lock"

RDEPENDS:${PN} += "python-abi \
python313-atpublic \
python313-psutil"

inherit rpm
