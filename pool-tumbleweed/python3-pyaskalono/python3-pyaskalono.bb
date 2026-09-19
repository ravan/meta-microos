SUMMARY = "Python bindings for askalono - rust library to detect license texts"
DESCRIPTION = "Python bindings for askalono - rust library to detect license texts."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python3-pyaskalono-0.2.0-1.8.aarch64.rpm"
RPM_HASH = "5b5306849a0f6768da4935dc27d8a03993c86d669c69261dcb7a4055d4086435afa88bc183989c7edfa8d2f73b1bcb46332e35bdd5ad76434b8833da6acb7999"

RPROVIDES:${PN} += "python3-pyaskalono \
python3.13dist-pyaskalono \
python3dist-pyaskalono"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
