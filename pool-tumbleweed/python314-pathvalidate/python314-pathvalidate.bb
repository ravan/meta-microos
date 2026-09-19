SUMMARY = "Python library to sanitize/validate a string such as filenames"
DESCRIPTION = "pathvalidate is a Python library to sanitize/validate a string such as \
filenames/file-paths/etc."
LICENSE = "MIT"

PV = "3.3.1"

RPM_NAME = "python314-pathvalidate-3.3.1-1.3.noarch.rpm"
RPM_HASH = "c077890fcac70ffc388aed98ea1e3c4ccaecd19dc96b0c1dd9f5e96dcd00fe4e3fe7c48cc6a2f236ce658742046da7135f08f76c5b48d8937eaba995b2fb4790"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pathvalidate \
python314-pathvalidate \
python3dist-pathvalidate"

RDEPENDS:${PN} += "python-abi"

inherit rpm
