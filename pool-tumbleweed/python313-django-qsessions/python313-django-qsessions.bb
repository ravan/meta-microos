SUMMARY = "Extended session backends for Django"
DESCRIPTION = "Extended session backends for Django."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python313-django-qsessions-2.1.0-1.3.noarch.rpm"
RPM_HASH = "86204857b3ef3b7e83f64f35cccac9023edb1c30c2593f6aee9e84b3dce2ffab0151f1587b21db6a1cdd666336f36c957b10b194464703b7ca6f72cc32fd73b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-qsessions \
python3.13dist-django-qsessions \
python313-django-qsessions \
python3dist-django-qsessions"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-ua-parser"

inherit rpm
