SUMMARY = "Object-Oriented HTTP framework"
DESCRIPTION = "CherryPy is a pythonic, object-oriented HTTP framework. \
 \
CherryPy allows developers to build web applications in much the same way they \
would build any other object-oriented Python program. This usually results in \
smaller source code developed in less time. \
 \
CherryPy is now more than three years old and it is has proven very fast and \
stable. It is being used in production by many sites, from the simplest ones \
to the most demanding ones. \
 \
Oh, and most importantly: CherryPy is fun to work with :-)"
LICENSE = "BSD-3-Clause"

PV = "18.10.0"

RPM_NAME = "python314-CherryPy-18.10.0-4.1.noarch.rpm"
RPM_HASH = "e36ef2dfd6735d624f9640b1503f3e3d1b9c26ca07364a37577ae3d4f6172cbf77ccc6052b69e8c9f47230b6e16e36cc574501e043ba27938a6fa2be9c8357ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cherrypy \
python314-CherryPy \
python3dist-cherrypy"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-cheroot \
python314-jaraco.collections \
python314-more-itertools \
python314-portend \
python314-zc.lockfile"

inherit rpm
