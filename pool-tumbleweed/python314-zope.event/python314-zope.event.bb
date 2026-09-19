SUMMARY = "Very basic event publishing system"
DESCRIPTION = "An event publishing system and a very simple event-dispatching system on \
which more sophisticated event dispatching systems can be built. For \
example, a type-based event dispatching system that builds on zope.event \
can be found in zope.component."
LICENSE = "ZPL-2.1"

PV = "6.2"

RPM_NAME = "python314-zope.event-6.2-1.2.noarch.rpm"
RPM_HASH = "ef2c9e258789f4d3788825ea5924129d7f8b2c4f8516e46aae0cd42bb24ae7699e4ce5703178298018038e214ccb40c4542035c9aab5dd45645b390daaeeeaa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-zope.event \
python314-zope.event \
python3dist-zope.event"

RDEPENDS:${PN} += "python-abi"

inherit rpm
