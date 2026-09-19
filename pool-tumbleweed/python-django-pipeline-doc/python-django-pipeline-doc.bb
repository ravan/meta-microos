SUMMARY = "Man files for python-django-pipeline"
DESCRIPTION = "Documentation files for python-django-pipeline"
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python-django-pipeline-doc-4.1.0-2.1.noarch.rpm"
RPM_HASH = "9de047cdee10b598f5a5469292776870e6a2f9338cf24f005d2052002875fc6f63c3fbc1d8187a9a779784c97e82a76b8c6fff8f35a62fa5922337ff4fb3ef82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-django-pipeline-doc"

RDEPENDS:${PN} += "python3-django-pipeline"

inherit rpm
