SUMMARY = "Android boot.img manipulation tools"
DESCRIPTION = "This package contains the Android boot.img manipulation tools."
LICENSE = "Apache-2.0 & MIT"

PV = "37.0.0"

RPM_NAME = "android-tools-mkbootimg-37.0.0-1.2.noarch.rpm"
RPM_HASH = "2b392605d5aca245ca1ae8ad272b15b4069f96523a2c7a1e7c28b4467674d686bc82832a71319d6e83ab0ac82225e3b4f389bdb1bbdb9089339e7fbd880c8507"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "android-tools-mkbootimg"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
android-tools"

inherit rpm
