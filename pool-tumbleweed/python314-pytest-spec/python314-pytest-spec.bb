SUMMARY = "Plugin to display pytest execution output like a specification"
DESCRIPTION = "pytest plugin to display test execution output like a specification."
LICENSE = "GPL-2.0-only"

PV = "6.0.0"

RPM_NAME = "python314-pytest-spec-6.0.0-1.4.noarch.rpm"
RPM_HASH = "a5c3579b59c93c188ac5386455e750b547cb747e8cc652ec304919dcffb7f2b836eaf9703fd9f12856bee17016e6fadb58295df77472aa93420a7dbcf1635e4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-spec \
python314-pytest-spec \
python3dist-pytest-spec"

RDEPENDS:${PN} += "python-abi"

inherit rpm
