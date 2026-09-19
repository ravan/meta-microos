SUMMARY = "Debug information for package mingw64-winpthreads"
DESCRIPTION = "This package provides debug information for package mingw64-winpthreads. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "BSD-3-Clause & MIT"

PV = "14.0.0"

RPM_NAME = "mingw64-winpthreads-debug-14.0.0-1.1.noarch.rpm"
RPM_HASH = "d8cc9ea4acf230b2f97fcc90572191f0f6df8abd5ed841ee12847f012c249d74505430c35f29e47da60bcff65e97895656a391c39a3c77cdc18630bbf255afed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-winpthreads-debug"

RDEPENDS:${PN} += ""

inherit rpm
