SUMMARY = "Microsoft Azure Storage File Client Library for Python"
DESCRIPTION = "This project provides a client library in Python that makes it easy to \
consume Microsoft Azure Storage services. For documentation please see \
the Microsoft Azure `Python Developer Center`_ and our `API Reference`_ \
Page."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python313-azure-storage-file-2.1.0-4.9.noarch.rpm"
RPM_HASH = "31bbbaac4cf9b1064e7eb4e480ce60f96bd25896dec4106466ce4e472979e3859511a2d7fc58884c583add584d881f35beae78d1d7891d19823ec20871ea3c6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-storage-file \
python3.13dist-azure-storage-file \
python313-azure-storage-file \
python3dist-azure-storage-file"

RDEPENDS:${PN} += "-python313-azure-storage-common >= 2.1.0 with python313-azure-storage-common < 3.0.0 \
python-abi \
python313-azure-common \
python313-azure-nspkg \
python313-azure-storage-nspkg"

inherit rpm
