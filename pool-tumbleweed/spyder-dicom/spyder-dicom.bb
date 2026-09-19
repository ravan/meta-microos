SUMMARY = "DICOM I/O plugin for the Spyder IDE"
DESCRIPTION = "Spyder, the Scientific Python Development Environment, is an \
IDE for researchers, engineers and data analysts. \
 \
This package contains the plugin that allows Spyder to read and write \
DICOM files."
LICENSE = "MIT"

PV = "5.5.1"

RPM_NAME = "spyder-dicom-5.5.1-1.1.noarch.rpm"
RPM_HASH = "f26e7e99897afd9f5cce1d65d525b1e93172a1e00c138420274dcaacb34b878cb22376116fd9e4da97f6b55a1f5b4c7b662aa4e999009d48767015677173c90c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spyder-dicom \
spyder3-dicom"

RDEPENDS:${PN} += "python-abi \
python3-pydicom \
spyder"

inherit rpm
