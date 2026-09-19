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

RPM_NAME = "python313-CherryPy-18.10.0-4.1.noarch.rpm"
RPM_HASH = "52c1d85b5d5ac523ffe0d7014514028da66e50129b693c4a6fbf5d23d0189d903747a01f66a191204392f22b78fea7b23cf2f03c62a4722e332f2944b2650e0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-CherryPy \
python3.13dist-cherrypy \
python313-CherryPy \
python3dist-cherrypy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-cheroot \
python313-jaraco.collections \
python313-more-itertools \
python313-portend \
python313-zc.lockfile"

inherit rpm
