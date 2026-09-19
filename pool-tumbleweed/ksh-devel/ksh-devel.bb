SUMMARY = "Korn Shell development environment"
DESCRIPTION = "The package includes C header files and the static libraries together \
with the shared libraries for linking with other projects.  Please be \
aware that the CPL licensed code can not be used within GPL licensed \
project. \
 \
 \
 \
Authors: \
-------- \
    David Korn <dgk@research.att.com> \
    Glenn Fowler <gsf@research.att.com> \
    Phong Vo <kpv@research.att.com>"
LICENSE = "CPL-1.0"

PV = "93vu"

RPM_NAME = "ksh-devel-93vu-14.1.aarch64.rpm"
RPM_HASH = "808d78751b1e9f17ff87c829330db2cbf3ad90528969b4ca224c1fa38cbb919f50ebc167a919c976f85d100b19e579b06711ea006a219bd524692e5c0935fe84"

RPROVIDES:${PN} += "ksh-devel"

RDEPENDS:${PN} += "ksh"

inherit rpm
