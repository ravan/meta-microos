SUMMARY = "Jalali datetime binding for python"
DESCRIPTION = "jdatetime is the Jalali implementation of Python's datetime module."
LICENSE = "Python-2.0"

PV = "5.2.0"

RPM_NAME = "python313-jdatetime-5.2.0-2.2.noarch.rpm"
RPM_HASH = "b26af95c683f7ad149e712a16b9ed828d3b846bf3f51c7ff0b0394cb6c6e40ed723dfcc248d7235dd962b81f2ede8b3f2f54a9d657655047e2a555b59ce3b515"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jdatetime \
python3.13dist-jdatetime \
python313-jdatetime \
python3dist-jdatetime"

RDEPENDS:${PN} += "python-abi \
python313-jalali-core"

inherit rpm
