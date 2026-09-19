SUMMARY = "A pthreads implementation for Windows"
DESCRIPTION = "mingw-w64's implementation of POSIX threads for Windows."
LICENSE = "BSD-3-Clause & MIT"

PV = "14.0.0"

RPM_NAME = "mingw32-libwinpthread1-14.0.0-1.1.noarch.rpm"
RPM_HASH = "c66856ae47f01f592bec343564f1e1aed8e7076782990b8fcc25b55e4ea9418892a428eec6e32bda5e0197f743751a3b142807c08419f620a2897cf48cf02e06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-libwinpthread-1.dll \
mingw32-libwinpthread1"

RDEPENDS:${PN} += ""

inherit rpm
