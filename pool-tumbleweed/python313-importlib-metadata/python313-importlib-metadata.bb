SUMMARY = "Read metadata from Python packages"
DESCRIPTION = "This package supplies third-party access to the functionality of \
importlib.metadata including improvements added to subsequent Python versions."
LICENSE = "Apache-2.0"

PV = "9.0.1"

RPM_NAME = "python313-importlib-metadata-9.0.1-1.1.noarch.rpm"
RPM_HASH = "6df8d4c9d4a0fd4a46c0730719d80ce442251d504be71db7427978ba96669a99fcdae4af37d45fa4a834e7dbfbc25fa484546610780d74203d61a8437e444dde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-importlib-metadata \
python3.13dist-importlib-metadata \
python313-importlib-metadata \
python3dist-importlib-metadata"

RDEPENDS:${PN} += "python-abi \
python313-zipp"

inherit rpm
