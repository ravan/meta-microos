SUMMARY = "Distributed object middleware for Python (RPC)"
DESCRIPTION = "Pyro means PYthon Remote Objects. \
 \
It is a library for building applications in which objects can talk \
to each other over the network. One can use normal Python method \
calls, with almost every possible parameter and return value type, \
and Pyro takes care of locating the right object on the right system \
to execute the method. It also provides a set of features that enable \
building distributed applications. Pyro is a pure Python library and \
runs on many different platforms and Python versions."
LICENSE = "MIT"

PV = "5.16"

RPM_NAME = "python314-Pyro5-5.16-1.4.noarch.rpm"
RPM_HASH = "823185d692598077afd69c205f9d06f9da348b0521d27c507a45285ef59fef258392e340a77e726fc99216197b667241c6bcfe3e3873100230c477d8f6115da2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyro5 \
python314-Pyro5 \
python3dist-pyro5"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-serpent"

inherit rpm
