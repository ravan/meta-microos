SUMMARY = "Development files for mingw64-winpthreads"
DESCRIPTION = "mingw-w64's implementation of POSIX threads for Windows."
LICENSE = "BSD-3-Clause & MIT"

PV = "14.0.0"

RPM_NAME = "mingw64-winpthreads-devel-14.0.0-1.1.noarch.rpm"
RPM_HASH = "78e58f5ba6e08664854b47ce181e62f1889d55f79dfff08948415adaa13215ef34c2164fd7a5c99bb5db501e6ee071881f4fa725a1d1b574bdee5e25d25caac7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-lib-pthread \
mingw64-lib-winpthread \
mingw64-unistd-pthread-devel \
mingw64-winpthreads-devel"

RDEPENDS:${PN} += "mingw64-libwinpthread1"

inherit rpm
