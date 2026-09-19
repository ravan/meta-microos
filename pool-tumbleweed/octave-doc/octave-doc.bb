SUMMARY = "Documentation for Octave"
DESCRIPTION = "Octave is a high level programming language. It is designed for the \
solution of numeric problems. \
 \
This package contains documentation for Octave."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.0"

RPM_NAME = "octave-doc-11.3.0-1.2.noarch.rpm"
RPM_HASH = "b106b117564504e16dec8fcbb3a10f4c651ab61824c72cceaa93c8ab05f347870192ae852041394e554081d4ab80c74a02401e76077865ca84a9cb34f267c917"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-doc"

RDEPENDS:${PN} += ""

inherit rpm
