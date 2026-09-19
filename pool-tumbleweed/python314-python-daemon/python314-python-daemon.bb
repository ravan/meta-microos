SUMMARY = "Library to implement a well-behaved Unix daemon process"
DESCRIPTION = "This library implements the well-behaved daemon specification of PEP 3143, \
'Standard daemon process library'. \
 \
A well-behaved Unix daemon process is tricky to get right, but the required \
steps are much the same for every daemon program. A DaemonContext instance \
holds the behaviour and configured process environment for the program; use the \
instance as a context manager to enter a daemon state."
LICENSE = "Apache-2.0 & GPL-3.0-only"

PV = "3.1.2"

RPM_NAME = "python314-python-daemon-3.1.2-1.3.noarch.rpm"
RPM_HASH = "705a681d8fae46a0e0c6a4d0bb534a365bf9bd2bcf3166f295818b50676e4e724b7c84c611c422632cf774988d1ecea16138968203689c0a03fe40a672ccba79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-daemon \
python314-python-daemon \
python3dist-python-daemon"

RDEPENDS:${PN} += "python-abi \
python314-lockfile"

inherit rpm
