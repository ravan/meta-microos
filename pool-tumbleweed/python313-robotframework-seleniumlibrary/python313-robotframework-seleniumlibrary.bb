SUMMARY = "Web testing library for Robot Framework"
DESCRIPTION = "Web testing library for Robot Framework"
LICENSE = "Apache-2.0"

PV = "6.9.0"

RPM_NAME = "python313-robotframework-seleniumlibrary-6.9.0-1.2.noarch.rpm"
RPM_HASH = "f4c4905dd0434cee884032f2a4924f9374a7c4686cb9b8592a520789d46b1c8b62acc99b8ed36ca8019e5a614d90e1fce170e3eb098b3b4cc8199e812336f278"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-robotframework-seleniumlibrary \
python3.13dist-robotframework-seleniumlibrary \
python313-robotframework-seleniumlibrary \
python3dist-robotframework-seleniumlibrary"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-click \
python313-robotframework \
python313-robotframework-pythonlibcore \
python313-selenium \
update-alternatives"

inherit rpm
