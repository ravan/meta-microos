SUMMARY = "PEG Parser-Interpreter framework for Python"
DESCRIPTION = "pyPEG is a plain and simple intrinsic parser interpreter framework \
for Python. It is based on Parsing Expression Grammar, PEG. \
With pyPEG you can parse many formal languages in a very easy way."
LICENSE = "GPL-2.0-only"

PV = "2.15.2"

RPM_NAME = "python313-pyPEG2-2.15.2-4.8.noarch.rpm"
RPM_HASH = "63667314c0a15a4f61f3ddeca2ed406f034fb87ad35b74b701937834d0ff48f9a0fdcbb60999c17931a3d1a49385445ca3a82d1022dcbefb962e1bcf8c66c7cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyPEG2 \
python3.13dist-pypeg2 \
python313-pyPEG2 \
python3dist-pypeg2"

RDEPENDS:${PN} += "python-abi \
python313-lxml"

inherit rpm
