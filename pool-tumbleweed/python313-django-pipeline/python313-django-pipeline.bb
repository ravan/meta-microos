SUMMARY = "An asset packaging library for Django"
DESCRIPTION = "Pipeline is an asset packaging library for Django, providing both CSS and \
JavaScript concatenation and compression, built-in JavaScript template support, \
and optional data-URI image and font embedding."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python313-django-pipeline-4.1.0-2.1.noarch.rpm"
RPM_HASH = "d7898d9f5c259f6899f9db598846a02229855afa9a77a9f2d343db005c4c053a8e3e88da1052fa80f3a8ad9b71405c4d387567fa474dfe6c3f5e30fd548bd41c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-pipeline \
python3.13dist-django-pipeline \
python313-django-pipeline \
python3dist-django-pipeline"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
