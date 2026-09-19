SUMMARY = "Remote repository management made easy"
DESCRIPTION = "ghq provides a way to organize remote repository clones, like go get does. \
When you clone a remote repository by ghq get, ghq makes a directory under a \
specific root directory (by default ~/ghq) using the remote repository URL's \
host and path."
LICENSE = "MIT"

PV = "1.10.1"

RPM_NAME = "ghq-1.10.1-1.1.aarch64.rpm"
RPM_HASH = "63715a4b8385896d392147ab19c0b03ca89ff8ef213f3298569dc78ff228f8020529c4025e1de15bb051b0ff247215c7671cc3f743c8cce1376911b1f22d0de1"

RPROVIDES:${PN} += "ghq"

RDEPENDS:${PN} += "git-core \
libc.so.6"

inherit rpm
