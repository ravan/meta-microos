SUMMARY = "Verbose logging level for Python's logging module"
DESCRIPTION = "The verboselogs_ package extends Python's logging_ module to add the log levels \
VERBOSE_, NOTICE_, and SPAM_: \
 \
- The VERBOSE level sits between the predefined INFO and DEBUG levels. \
- The NOTICE level sits between the predefined WARNING and INFO levels. \
- The SPAM level sits between the predefined DEBUG and NOTSET levels. \
 \
It is currently tested on Python 2.6, 2.7, 3.4, 3.5 and PyPy."
LICENSE = "MIT"

PV = "1.7"

RPM_NAME = "python314-verboselogs-1.7-8.9.noarch.rpm"
RPM_HASH = "ad6b6b44df73653dcb8fec31e43a991af25bcd950b3a08bb6d3d4a2db3b463d03c537b79fd17e7669d7099b6ff2c27be0eb84c31c756cc8f18287a257cf25cd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-verboselogs \
python314-verboselogs \
python3dist-verboselogs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
