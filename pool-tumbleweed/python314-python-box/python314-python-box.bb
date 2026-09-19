SUMMARY = "Advanced Python dictionaries with dot notation access"
DESCRIPTION = "Advanced Python dictionaries with dot notation access"
LICENSE = "MIT"

PV = "7.3.2"

RPM_NAME = "python314-python-box-7.3.2-1.5.noarch.rpm"
RPM_HASH = "7be4ded2ddd61f70f75be224be3d79b343590f5d102279c6835896cc00aa3a606d44bb1ccaa842f2f1404339eb65952e57f86776f38fba752f32fed293eeed30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-box \
python314-python-box \
python3dist-python-box"

RDEPENDS:${PN} += "python-abi"

inherit rpm
