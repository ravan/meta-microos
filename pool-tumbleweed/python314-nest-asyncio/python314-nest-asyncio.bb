SUMMARY = "Patch asyncio to allow nested event loops"
DESCRIPTION = "By design asyncio `does not allow <https://bugs.python.org/issue22239>`_ \
its event loop to be nested. This presents a practical problem: \
When in an environment where the event loop is \
already running it's impossible to run tasks and wait \
for the result. Trying to do so will give the error \
'``RuntimeError: This event loop is already running``'. \
 \
The issue pops up in various environments, such as web servers, \
GUI applications and in Jupyter notebooks. \
 \
This module patches asyncio to allow nested use of ``asyncio.run`` and \
``loop.run_until_complete``."
LICENSE = "BSD-2-Clause"

PV = "1.6.0"

RPM_NAME = "python314-nest-asyncio-1.6.0-3.4.noarch.rpm"
RPM_HASH = "40f3e9368886011ce269f9f5fe9cf8a14cd171108f699dbd55fd17b61ff6f13d16de507a2356650987300ab033814705952fd2a549ed80d173ba1a2f45a71f07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-nest-asyncio \
python314-nest-asyncio \
python3dist-nest-asyncio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
