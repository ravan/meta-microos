SUMMARY = "Python unittest Utilities"
DESCRIPTION = "Python unittest Utilities."
LICENSE = "BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "python314-case-1.5.3-9.5.noarch.rpm"
RPM_HASH = "d2f70e0b6cc67bc65f5ecaae8a202dfba8c6df7e8bce7572cfc63f9634bf62c6005fb5f423393e972f8a264e804f8e4bc79fea1be5f16844f902aaf1ab60c3ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-case \
python314-case \
python3dist-case"

RDEPENDS:${PN} += "python-abi \
python314-pytest \
python314-setuptools \
python314-six"

inherit rpm
