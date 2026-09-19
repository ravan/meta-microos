SUMMARY = "Akismet v1.1 module for Python"
DESCRIPTION = "Akismet v1.1 module for Python."
LICENSE = "MIT"

PV = "0.4.3"

RPM_NAME = "python314-python-akismet-0.4.3-2.5.noarch.rpm"
RPM_HASH = "120db330b46c9af0f6df153ca8ea8407c8ac2526056ef8acb14077411b679c335b87e648da296861d0dc74a73e98e884ccdb2f9ee7381caa6ced3d0df2fa9f41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-akismet \
python314-python-akismet \
python3dist-python-akismet"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
