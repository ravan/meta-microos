SUMMARY = "Python library to programmatically open an editor and capture the result"
DESCRIPTION = "python-editor is a library that provides the editor module for \
programmatically interfacing with the editor defined in the EDITOR \
environment variable."
LICENSE = "Apache-2.0"

PV = "1.0.4+git13"

RPM_NAME = "python313-python-editor-1.0.4+git13-1.5.noarch.rpm"
RPM_HASH = "0c2b0e042be12c5465957dd312ee1588df37ea203e9e089a237e3571351d9d30cec8ce68ec7ccdabfba9635bb67b5e3b6938922101458fcdbf5eb81b75f5ff5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-editor \
python3.13dist-python-editor \
python313-python-editor \
python3dist-python-editor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
