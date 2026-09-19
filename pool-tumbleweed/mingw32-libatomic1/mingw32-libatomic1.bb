SUMMARY = "The GNU Compiler Atomic Operations Runtime Library"
DESCRIPTION = "The runtime library for atomic operations of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw32-libatomic1-16.2.0-1.1.noarch.rpm"
RPM_HASH = "3ce57b9a724f667ddf3eee073d05c8c231848bd4af6d541def926b07f59b362a70479f84add905fc5e656856ad0b351d5c2284d3aba217a0b0bd5194f82d2cde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-libatomic-1.dll \
mingw32-libatomic1"

RDEPENDS:${PN} += "mingw32-libwinpthread-1.dll"

inherit rpm
