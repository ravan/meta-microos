SUMMARY = "Callback API implemented over Proton"
DESCRIPTION = "A messaging framework built on the QPID Proton engine. It \
provides a callback-based API for message passing"
LICENSE = "Apache-2.0"

PV = "2.3.1"

RPM_NAME = "python313-pyngus-2.3.1-2.5.noarch.rpm"
RPM_HASH = "5d8fd5e8de638601b287b0fbb5236525bf2cad61e91fe364a4db76158bf13fcc7f51144000ca946eb00aafbeea6a2672fa4363e4b0cc64f63a079c9b2dec20e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyngus \
python3.13dist-pyngus \
python313-pyngus \
python3dist-pyngus"

RDEPENDS:${PN} += "python-abi \
python313-python-qpid-proton"

inherit rpm
