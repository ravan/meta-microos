SUMMARY = "Tianocore Edk2 PyTool Library"
DESCRIPTION = "This is a Tianocore maintained project consisting of a python library supporting UEFI firmware development. This package's intent is to provide an easy way to organize and share python code to facilitate reuse across environments, tools, and scripts."
LICENSE = "BSD-2-Clause-Patent"

PV = "0.23.16"

RPM_NAME = "python314-edk2toollib-0.23.16-1.1.noarch.rpm"
RPM_HASH = "1b7d75179b1d81dd461e40b3077c4d13d062cdbe962b96d5f340aab8f8f7372de27addf8b1a7eab3d69439522126575112106c5a36bcd29210e4fd8b4d3e79c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-edk2-pytool-library \
python314-edk2toollib \
python3dist-edk2-pytool-library"

RDEPENDS:${PN} += "python-abi \
python314-GitPython \
python314-SQLAlchemy \
python314-cryptography \
python314-joblib \
python314-pyasn1 \
python314-pyasn1-modules \
python314-pygount"

inherit rpm
