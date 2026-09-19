SUMMARY = "Python module for capturing stdout/stderr of the current process group"
DESCRIPTION = "The capturer package captures the stdout and stderr streams \
of the current process *and subprocesses*. Output can be relayed to the \
terminal in real time, but is also available to the Python program for \
additional processing. It's currently tested on cPython 2.6, 2.7, 3.4, 3.5, 3.6 \
and PyPy (2.7). It's tested on Linux and Mac OS X and may work on other unixes \
but definitely won't work on Windows (due to the use of the platform dependent \
'pty' module)."
LICENSE = "MIT"

PV = "3.0"

RPM_NAME = "python314-capturer-3.0-4.4.noarch.rpm"
RPM_HASH = "db8b0e9cba04e221fac58237eed9790504d7a37f3bf39120f39ac04b03825575f3d231de914c9371781c2002ada6d897ae5c08e11f6ebb021dabc5a136729c53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-capturer \
python314-capturer \
python3dist-capturer"

RDEPENDS:${PN} += "python-abi \
python314-humanfriendly"

inherit rpm
