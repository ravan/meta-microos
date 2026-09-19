SUMMARY = "Bindings for Chromaprint acoustic fingerprinting and the Acoustid API"
DESCRIPTION = "Chromaprint and Acoustid for Python \
 \
Chromaprint and its associated Acoustid Web service make up a \
high-quality, open-source acoustic fingerprinting system. This package provides \
Python bindings for both the fingerprinting algorithm library, which is written \
in C but portable, and the Web service, which provides fingerprint lookups."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python314-pyacoustid-1.3.1-1.2.noarch.rpm"
RPM_HASH = "b6af7f56823256c44266e46f124c352234a51dce8828973c2573f8de43e673b83d096c92c2d84681cd0d279de59a00c608195e4418a02db897de8aa8e29e576c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyacoustid \
python314-pyacoustid \
python3dist-pyacoustid"

RDEPENDS:${PN} += "python-abi \
python314-audioread \
python314-requests"

inherit rpm
