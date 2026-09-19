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

RPM_NAME = "python313-Pyro5-5.16-1.4.noarch.rpm"
RPM_HASH = "b10a1f556abefcd0af615525d0a9768a73526b5cf629dfc9bf2b3fe5ff6399ff9212f3d4f2824a1d18f9466c5411fb841314f4d205ef6a90f990ed1645739fa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Pyro5 \
python3.13dist-pyro5 \
python313-Pyro5 \
python3dist-pyro5"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-serpent"

inherit rpm
