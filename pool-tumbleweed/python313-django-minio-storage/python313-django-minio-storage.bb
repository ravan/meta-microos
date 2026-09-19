SUMMARY = "Django file storage using minio"
DESCRIPTION = "Django file storage using the minio python client."
LICENSE = "Apache-2.0"

PV = "0.5.9"

RPM_NAME = "python313-django-minio-storage-0.5.9-1.3.noarch.rpm"
RPM_HASH = "6c2df4b4dfb04f1beb715fedd0e517e42cd4acd68199cf8b8f1aa701ea4d694bef914e90d98db0e801daa2e1dcc93999221eec5d6f110e9139c762b874d050de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-minio-storage \
python3.13dist-django-minio-storage \
python313-django-minio-storage \
python3dist-django-minio-storage"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-minio"

inherit rpm
