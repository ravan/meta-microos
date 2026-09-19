SUMMARY = "Python library for quantum information and many-body calculations"
DESCRIPTION = "quimb is an easy but fast python library for quantum information and \
many-body calculations, including with tensor networks."
LICENSE = "Apache-2.0"

PV = "1.14.0"

RPM_NAME = "python313-quimb-1.14.0-1.2.noarch.rpm"
RPM_HASH = "882ea3bcc02aab10efb89ee4c81419bcb6722e83630e125b6d2e40155de55c5ba5c98990c76d9c64a9af44a0a3268af9e68cb1bb7cb23979f5774fa2bd885c6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-quimb \
python3.13dist-quimb \
python313-quimb \
python3dist-quimb"

RDEPENDS:${PN} += "python-abi \
python313-autoray \
python313-cotengra \
python313-cytoolz \
python313-numba \
python313-numpy \
python313-psutil \
python313-scipy \
python313-tqdm \
update-alternatives"

inherit rpm
