SUMMARY = "Documentation for python-gevent"
DESCRIPTION = "Documentation and examples for python-gevent."
LICENSE = "MIT"

PV = "26.8.0"

RPM_NAME = "python-gevent-doc-26.8.0-1.1.noarch.rpm"
RPM_HASH = "d2ae18e91517e040e6af5fa29c340b977e4bbfa657440732a54be346d6fc402974f73732bab6da0613eb3f491dbe690874fee67a882d89a32e3171a65d3dfef0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-gevent-doc \
python313-gevent-doc \
python314-gevent-doc"

RDEPENDS:${PN} += ""

inherit rpm
