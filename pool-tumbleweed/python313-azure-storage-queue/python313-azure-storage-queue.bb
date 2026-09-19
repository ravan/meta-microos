SUMMARY = "Microsoft Azure Storage Queue Client Library for Python"
DESCRIPTION = "This project provides a client library in Python that makes it easy to \
consume Microsoft Azure Storage services. For documentation please see \
the Microsoft Azure `Python Developer Center`_ and our `API Reference`_ \
Page."
LICENSE = "MIT"

PV = "12.17.0"

RPM_NAME = "python313-azure-storage-queue-12.17.0-1.2.noarch.rpm"
RPM_HASH = "ec9d524201dd77a8732871c131acb3329aa8bdb4d4290a99c0504c0cbb0e8388283b4de25b142dd78f960da9d6d503947658d21b7bd78c6acca64cbcefc75f00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-storage-queue \
python3.13dist-azure-storage-queue \
python313-azure-storage-queue \
python3dist-azure-storage-queue"

RDEPENDS:${PN} += "-python313-azure-core >= 1.30.0 with python313-azure-core < 2.0.0 \
-python313-azure-storage-common >= 2.1.0 with python313-azure-storage-common < 3.0.0 \
python-abi \
python313-azure-common \
python313-azure-nspkg \
python313-azure-storage-nspkg \
python313-cryptography \
python313-isodate \
python313-typing-extensions"

inherit rpm
