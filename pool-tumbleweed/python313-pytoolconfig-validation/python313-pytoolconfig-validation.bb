SUMMARY = "[validation] extra for python313-pytoolconfig"
DESCRIPTION = "Python Tool Configuration - [validation] extra"
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "python313-pytoolconfig-validation-1.3.1-1.11.noarch.rpm"
RPM_HASH = "42f72697e4ad8621cf8076368ec1e60e4e3d5b1f8bd08e72a2d38ca8a6010c865c53bb9e43a3e15c6efc7e0d8afc32192da79ae9b88421bfb6b5745a9e6f48f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytoolconfig-validation \
python313-pytoolconfig-validation"

RDEPENDS:${PN} += "python313-pydantic \
python313-pytoolconfig"

inherit rpm
