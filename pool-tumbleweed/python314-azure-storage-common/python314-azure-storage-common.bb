SUMMARY = "Microsoft Azure Storage Common Client Library for Python"
DESCRIPTION = "This project provides a client library in Python that makes it easy to \
consume Microsoft Azure Storage services. For documentation please see \
the Microsoft Azure `Python Developer Center`_ and our `API Reference`_ \
Page."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python314-azure-storage-common-2.1.0-4.9.noarch.rpm"
RPM_HASH = "9cc1e578c13121f96df74c83971b4bf2c5ce142e753564b3785477a5fefafee46212b48b07b3aa6adc7d183a2a488988e9487b987604e3264e24834427532ac7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-storage-common \
python314-azure-storage-common \
python3dist-azure-storage-common"

RDEPENDS:${PN} += "python-abi \
python314-azure-common \
python314-azure-nspkg \
python314-azure-storage-nspkg \
python314-cryptography \
python314-python-dateutil \
python314-requests"

inherit rpm
