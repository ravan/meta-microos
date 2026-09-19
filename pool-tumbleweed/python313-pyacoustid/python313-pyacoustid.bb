SUMMARY = "Bindings for Chromaprint acoustic fingerprinting and the Acoustid API"
DESCRIPTION = "Chromaprint and Acoustid for Python \
 \
Chromaprint and its associated Acoustid Web service make up a \
high-quality, open-source acoustic fingerprinting system. This package provides \
Python bindings for both the fingerprinting algorithm library, which is written \
in C but portable, and the Web service, which provides fingerprint lookups."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python313-pyacoustid-1.3.1-1.2.noarch.rpm"
RPM_HASH = "a174051a63dc3654017861bae23c8b777b659efe95df31ee9476b827340170923ec94904c7a0e75b3ff9e550edd041831c7fb284f58bea6d532f29b7dd807dc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyacoustid \
python3.13dist-pyacoustid \
python313-pyacoustid \
python3dist-pyacoustid"

RDEPENDS:${PN} += "python-abi \
python313-audioread \
python313-requests"

inherit rpm
