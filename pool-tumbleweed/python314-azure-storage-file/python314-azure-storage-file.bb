SUMMARY = "Microsoft Azure Storage File Client Library for Python"
DESCRIPTION = "This project provides a client library in Python that makes it easy to \
consume Microsoft Azure Storage services. For documentation please see \
the Microsoft Azure `Python Developer Center`_ and our `API Reference`_ \
Page."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python314-azure-storage-file-2.1.0-4.9.noarch.rpm"
RPM_HASH = "bc120c1a12073f31b984b58ab28c96e0e5a5b7988917c9f21416134731d1738221d9e56bc926134633f7150e900e52c09935e5939e00800972a82444d7e435f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-storage-file \
python314-azure-storage-file \
python3dist-azure-storage-file"

RDEPENDS:${PN} += "-python314-azure-storage-common >= 2.1.0 with python314-azure-storage-common < 3.0.0 \
python-abi \
python314-azure-common \
python314-azure-nspkg \
python314-azure-storage-nspkg"

inherit rpm
