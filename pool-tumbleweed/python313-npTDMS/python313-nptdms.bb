SUMMARY = "Python module for reading TDMS files produced by LabView"
DESCRIPTION = "NumPy based module for reading TDMS files produced by LabView."
LICENSE = "LGPL-3.0-only"

PV = "1.10.0"

RPM_NAME = "python313-npTDMS-1.10.0-1.3.noarch.rpm"
RPM_HASH = "de772f0d878f7a335f687dbee8627f14e5cee05f4a7417bc9983a8100889f6eaf0c81af946dbf07a2e4846c434ad3768d28517f2b15a486d3fd2de5e274ff0b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-npTDMS \
python3.13dist-nptdms \
python313-npTDMS \
python3dist-nptdms"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-numpy \
update-alternatives"

inherit rpm
