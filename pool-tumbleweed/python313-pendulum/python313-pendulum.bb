SUMMARY = "Python datetimes made easy"
DESCRIPTION = "Python datetimes made easy"
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python313-pendulum-3.2.0-2.1.aarch64.rpm"
RPM_HASH = "a22e39ee09f67cf761056b81a25933263306dab6f98b32df84d6ec430e5ecb7fb8679dc11246e8428f86177bab868381448545ede0b0d5338673dc73ab20b303"

RPROVIDES:${PN} += "python3-pendulum \
python3.13dist-pendulum \
python313-pendulum \
python3dist-pendulum"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi \
python313-python-dateutil \
python313-tzdata"

inherit rpm
