SUMMARY = "Minio library for Amazon S3 compatible cloud storage"
DESCRIPTION = "Minio library for Amazon S3 compatible cloud storage."
LICENSE = "Apache-2.0"

PV = "7.2.20"

RPM_NAME = "python313-minio-7.2.20-1.4.noarch.rpm"
RPM_HASH = "ea5ce603d9e97c9c50697e6d40c84d8c73ea4af9d26c88ae0b468a3e4cd0d88d184076cfbd85b8c01c94df9d371d9bec8191d3b37e17371f64ce9bc41f49b7e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-minio \
python3.13dist-minio \
python313-minio \
python3dist-minio"

RDEPENDS:${PN} += "python-abi \
python313-argon2-cffi \
python313-certifi \
python313-pycryptodome \
python313-typing-extensions \
python313-urllib3"

inherit rpm
