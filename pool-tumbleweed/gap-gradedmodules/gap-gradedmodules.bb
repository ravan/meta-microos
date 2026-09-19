SUMMARY = "GAP: Abelian finitely presented graded modules over a computable graded ring"
DESCRIPTION = "This homalg based package realizes the computability of the Abelian \
category of finitely presented graded modules over a computable \
graded ring."
LICENSE = "GPL-2.0-or-later"

PV = "2026.04.01"

RPM_NAME = "gap-gradedmodules-2026.04.01-1.2.noarch.rpm"
RPM_HASH = "3a96a033a55d5142f493067ee761ce3034d7ff8290fa7b50e03b5a7be178f06deb5e291467fafc90ac253c4fd69fcca908e06a7f4b982581f08d981d3483a281"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-gradedmodules"

RDEPENDS:${PN} += "gap-core \
gap-gapdoc \
gap-gradedringforhomalg \
gap-homalg \
gap-homalgtocas \
gap-matricesforhomalg \
gap-modules \
gap-ringsforhomalg \
gap-toolsforhomalg"

inherit rpm
