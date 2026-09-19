SUMMARY = "Python part of cepces"
DESCRIPTION = "cepces is an application for enrolling certificates through CEP and CES. \
This package provides the Python part for CEP and CES interaction."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.16"

RPM_NAME = "python3-cepces-0.3.16-1.4.noarch.rpm"
RPM_HASH = "34ae2c90f60db02f084af16f0b635c5af05be51fdc4e9577d9edb9688e02e8d83375ded152d192883b129b6ab80ee78d0e45af32213af9fe1f85958b21901b2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cepces \
python3.13dist-cepces \
python3dist-cepces"

RDEPENDS:${PN} += "python-abi \
python3-cryptography \
python3-requests \
python3-requests-gssapi"

inherit rpm
