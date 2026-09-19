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

RPM_NAME = "python313-verboselogs-1.7-8.9.noarch.rpm"
RPM_HASH = "9b247509af884f0fec3c6ad33be9acb0c04e9dfc450b1cddab892f8d72f262189259a0b8f4950bc032104f094bc818a3906fa7ccdf924702aea8a2665d6f0406"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-verboselogs \
python3.13dist-verboselogs \
python313-verboselogs \
python3dist-verboselogs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
