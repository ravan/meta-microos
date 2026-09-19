SUMMARY = "The GNU Compiler Atomic Operations Runtime Library"
DESCRIPTION = "The runtime library for atomic operations of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw64-libatomic1-16.2.0-1.1.noarch.rpm"
RPM_HASH = "b7aee76a38c9841ebdfd46255f5447bd56d7a50451d98cfbea0ab8f193c1f498956476a6d27632881d6dd16c2fc36d0d646017ea2a8473b3d4be1bebac6e7b51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-libatomic-1.dll \
mingw64-libatomic1"

RDEPENDS:${PN} += "mingw64-libwinpthread-1.dll"

inherit rpm
