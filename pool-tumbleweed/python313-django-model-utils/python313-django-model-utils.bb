SUMMARY = "Django model mixins and utilities"
DESCRIPTION = "Django model mixins and utilities."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "python313-django-model-utils-5.0.0-2.1.noarch.rpm"
RPM_HASH = "d4e55e9db5fcc5009f6eab66513d62a8650b93993a60aef51985c5a344ce06ef2d15a3f364c225562d6dd6c3f47fc7f70802acd3f370f0d566d729545dd986f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-model-utils \
python3.13dist-django-model-utils \
python313-django-model-utils \
python3dist-django-model-utils"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
