SUMMARY = "Tools to work with functools"
DESCRIPTION = "jaraco.functools Tools for working with functools. \
Additional functools in the spirit of stdlib’s functools."
LICENSE = "MIT"

PV = "6.1.2"

RPM_NAME = "python314-jaraco.context-6.1.2-1.3.noarch.rpm"
RPM_HASH = "05eb336f3acb88027e96cdf4e48a12de62e81fbfdb560fab87406fb8c8ff94b62b48d4cf3e690424b6c63f8c0d51454056a15a92b9aa149107c6180c00ae1b3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jaraco.context \
python314-jaraco.context \
python3dist-jaraco.context"

RDEPENDS:${PN} += "python-abi \
python314-backports.tarfile"

inherit rpm
