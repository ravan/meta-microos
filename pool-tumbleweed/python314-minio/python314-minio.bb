SUMMARY = "Minio library for Amazon S3 compatible cloud storage"
DESCRIPTION = "Minio library for Amazon S3 compatible cloud storage."
LICENSE = "Apache-2.0"

PV = "7.2.20"

RPM_NAME = "python314-minio-7.2.20-1.4.noarch.rpm"
RPM_HASH = "58559604de3d4ad0e908f410ab7642eff27ccfbb8acdfb82eb263095f71ef16caf92e967f8c3f47c93e4e8d5617104cecd3c7a6d8e7f41bfd9501da60bfad307"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-minio \
python314-minio \
python3dist-minio"

RDEPENDS:${PN} += "python-abi \
python314-argon2-cffi \
python314-certifi \
python314-pycryptodome \
python314-typing-extensions \
python314-urllib3"

inherit rpm
