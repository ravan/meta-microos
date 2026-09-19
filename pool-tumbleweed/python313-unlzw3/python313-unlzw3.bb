SUMMARY = "Pure Python decompression module for .Z files"
DESCRIPTION = "Pure Python decompression module for .Z files compressed using Unix \
compress utility. Unlike the faster but Linux-specific unlzw using \
Python CFFI, unlzw3 is slower but works on any platform that runs \
Python including Windows."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "python313-unlzw3-0.2.3-1.4.noarch.rpm"
RPM_HASH = "1cb352b5775788e74945f90b742b10104ef49374ecba08953e87dcd78fc26505ca8d4dabd56e6ee0e7ade65040e24f484aa27612b29619ceb6aa795fba251bc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-unlzw3 \
python3.13dist-unlzw3 \
python313-unlzw3 \
python3dist-unlzw3"

RDEPENDS:${PN} += "python-abi"

inherit rpm
