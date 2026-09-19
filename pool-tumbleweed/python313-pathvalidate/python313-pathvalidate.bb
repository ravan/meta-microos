SUMMARY = "Python library to sanitize/validate a string such as filenames"
DESCRIPTION = "pathvalidate is a Python library to sanitize/validate a string such as \
filenames/file-paths/etc."
LICENSE = "MIT"

PV = "3.3.1"

RPM_NAME = "python313-pathvalidate-3.3.1-1.3.noarch.rpm"
RPM_HASH = "da0220c8492cef008bb1ca010eaa2ac3d7b10ac84536c8676b40964cf0e910636d99e40179c98b1966d6ac15ed7dbd8081290f05a3a3bc803d8e3e95b87f038b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pathvalidate \
python3.13dist-pathvalidate \
python313-pathvalidate \
python3dist-pathvalidate"

RDEPENDS:${PN} += "python-abi"

inherit rpm
