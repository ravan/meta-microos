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

RPM_NAME = "python313-nest-asyncio-1.6.0-3.4.noarch.rpm"
RPM_HASH = "ab83f7139de22319004e0955d97a3ba68f2015032f88b9e0d746ee773fd13c636ed1fec02a23a9e31d6aba2606b54b1a1d852530f91f5739421b19ae8b7e31cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nest-asyncio \
python3.13dist-nest-asyncio \
python313-nest-asyncio \
python3dist-nest-asyncio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
