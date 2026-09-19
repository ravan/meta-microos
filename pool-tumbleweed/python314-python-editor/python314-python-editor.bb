SUMMARY = "Python library to programmatically open an editor and capture the result"
DESCRIPTION = "python-editor is a library that provides the editor module for \
programmatically interfacing with the editor defined in the EDITOR \
environment variable."
LICENSE = "Apache-2.0"

PV = "1.0.4+git13"

RPM_NAME = "python314-python-editor-1.0.4+git13-1.5.noarch.rpm"
RPM_HASH = "b7c5d1bff353dab4d83a969774e4fe06a7b75e70c721e4d9631af161ac16afc2cb1c3d3aee4beaf02e9c3faf07fd919b8353367a782cba55cbac4c349da01106"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-editor \
python314-python-editor \
python3dist-python-editor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
