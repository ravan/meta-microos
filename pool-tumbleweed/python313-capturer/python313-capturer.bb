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

RPM_NAME = "python313-capturer-3.0-4.4.noarch.rpm"
RPM_HASH = "b1f5402dfa269ce85c5223f6e610a49004dd0a80bbd6f0c107423920943a6c0ecc7cd9fbc9e507e9a2c5ce2779a51c38128d55c6cac32be7e46c6073b85a1c43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-capturer \
python3.13dist-capturer \
python313-capturer \
python3dist-capturer"

RDEPENDS:${PN} += "python-abi \
python313-humanfriendly"

inherit rpm
