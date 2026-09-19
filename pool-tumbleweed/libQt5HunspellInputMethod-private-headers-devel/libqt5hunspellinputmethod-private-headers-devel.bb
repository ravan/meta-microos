SUMMARY = "Non-ABI stable API for libQt5HunspellInputMethod"
DESCRIPTION = "This package provides private headers of libQt5HunspellInputMethod that are \
normally not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "GPL-3.0"

PV = "5.15.19+kde0"

RPM_NAME = "libQt5HunspellInputMethod-private-headers-devel-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "f9184bd751b6bbf2f4f294f004b781f3bad20b1c2002ba3f446eb24d2ed186f0e1aee0ddfff2a51de76dd46bb273177e7c1f4fa4a8d0b11e6e901ae24bd3e3ac"

RPROVIDES:${PN} += "cmake-Qt5HunspellInputMethod \
libQt5HunspellInputMethod-private-headers-devel"

RDEPENDS:${PN} += "libQt5HunspellInputMethod5 \
libqt5-qtvirtualkeyboard-private-headers-devel"

inherit rpm
