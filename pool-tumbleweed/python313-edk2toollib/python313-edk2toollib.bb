SUMMARY = "Tianocore Edk2 PyTool Library"
DESCRIPTION = "This is a Tianocore maintained project consisting of a python library supporting UEFI firmware development. This package's intent is to provide an easy way to organize and share python code to facilitate reuse across environments, tools, and scripts."
LICENSE = "BSD-2-Clause-Patent"

PV = "0.23.16"

RPM_NAME = "python313-edk2toollib-0.23.16-1.1.noarch.rpm"
RPM_HASH = "5992821b2385482ef32c396d483c54e5408551ecaf46f44a12430ed73606e27a7d8c4290d59169107deadbc633fe25919d29b6555f4af43e65bf1c18f031489a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-edk2toollib \
python3.13dist-edk2-pytool-library \
python313-edk2toollib \
python3dist-edk2-pytool-library"

RDEPENDS:${PN} += "python-abi \
python313-GitPython \
python313-SQLAlchemy \
python313-cryptography \
python313-joblib \
python313-pyasn1 \
python313-pyasn1-modules \
python313-pygount"

inherit rpm
