SUMMARY = "Microsoft Azure Storage Queue Client Library for Python"
DESCRIPTION = "This project provides a client library in Python that makes it easy to \
consume Microsoft Azure Storage services. For documentation please see \
the Microsoft Azure `Python Developer Center`_ and our `API Reference`_ \
Page."
LICENSE = "MIT"

PV = "12.17.0"

RPM_NAME = "python314-azure-storage-queue-12.17.0-1.2.noarch.rpm"
RPM_HASH = "5a0b05929ab0853ea177c917557457056cc137fc716af821005a8e5f02d815f16a2de1224d27d6777e77dab94006b04752bf6448f772aaa9befe4cb2b5e57719"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-storage-queue \
python314-azure-storage-queue \
python3dist-azure-storage-queue"

RDEPENDS:${PN} += "-python314-azure-core >= 1.30.0 with python314-azure-core < 2.0.0 \
-python314-azure-storage-common >= 2.1.0 with python314-azure-storage-common < 3.0.0 \
python-abi \
python314-azure-common \
python314-azure-nspkg \
python314-azure-storage-nspkg \
python314-cryptography \
python314-isodate \
python314-typing-extensions"

inherit rpm
