SUMMARY = "Platform Independent File Lock in Python"
DESCRIPTION = "This package contains a single module, which implements a platform \
independent file lock in Python, which provides a simple way of \
inter-process communication."
LICENSE = "MIT"

PV = "3.29.7"

RPM_NAME = "python313-filelock-3.29.7-1.1.noarch.rpm"
RPM_HASH = "87d9a4cd5e0d1fcebd7179a8ca80d486f8b7bf717b77e775db99287392d923de6a37f46828f4f38bc5baae39577e54323ae4393ab6ede7be2a7c564e75e96d02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-filelock \
python3.13dist-filelock \
python313-filelock \
python3dist-filelock"

RDEPENDS:${PN} += "python-abi \
python313-asyncio \
python313-sqlite3"

inherit rpm
