SUMMARY = "Very basic event publishing system"
DESCRIPTION = "An event publishing system and a very simple event-dispatching system on \
which more sophisticated event dispatching systems can be built. For \
example, a type-based event dispatching system that builds on zope.event \
can be found in zope.component."
LICENSE = "ZPL-2.1"

PV = "6.2"

RPM_NAME = "python313-zope.event-6.2-1.2.noarch.rpm"
RPM_HASH = "06b6c6ad4617947ed7c65ef62d1a5d65c9a83289185e80b5af771dea33987949d075f5305ad24160ce5b1ee1dac481065b7a24dde871c63c91095908ab65c9a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.event \
python3.13dist-zope.event \
python313-zope.event \
python3dist-zope.event"

RDEPENDS:${PN} += "python-abi"

inherit rpm
