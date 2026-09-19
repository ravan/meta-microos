SUMMARY = "A pthreads implementation for Windows"
DESCRIPTION = "mingw-w64's implementation of POSIX threads for Windows."
LICENSE = "BSD-3-Clause & MIT"

PV = "14.0.0"

RPM_NAME = "mingw64-libwinpthread1-14.0.0-1.1.noarch.rpm"
RPM_HASH = "24c397252adc72b48662b7020250faed1ddb7fe5bc2aedb720b632ee0283b1900b2710ca27dd39f41d54794085a090d7fd37c78e069b210e7a992f2dc280dbbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-libwinpthread-1.dll \
mingw64-libwinpthread1"

RDEPENDS:${PN} += ""

inherit rpm
