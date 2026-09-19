SUMMARY = "Python datetimes made easy"
DESCRIPTION = "Python datetimes made easy"
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python314-pendulum-3.2.0-2.1.aarch64.rpm"
RPM_HASH = "898f98640d33f6b5a720c81e5e495090eb8c78e8975db4f2aee152c9d92c4a3931136e79cb9f1f446d7c57ef6bf7bce189b712d4b3e9e494dc0926664decbbf4"

RPROVIDES:${PN} += "python3.14dist-pendulum \
python314-pendulum \
python3dist-pendulum"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi \
python314-python-dateutil \
python314-tzdata"

inherit rpm
