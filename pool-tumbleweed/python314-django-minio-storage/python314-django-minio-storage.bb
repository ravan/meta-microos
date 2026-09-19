SUMMARY = "Django file storage using minio"
DESCRIPTION = "Django file storage using the minio python client."
LICENSE = "Apache-2.0"

PV = "0.5.9"

RPM_NAME = "python314-django-minio-storage-0.5.9-1.3.noarch.rpm"
RPM_HASH = "29e987d21bd7734c5456c7d10f2c6cd85d2690c0e8bae9bf49212392296ef49553085f3dae28831a7a47d131e2a9b00b80a0eaabd214a27b42aff58bc9500be3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-minio-storage \
python314-django-minio-storage \
python3dist-django-minio-storage"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-minio"

inherit rpm
