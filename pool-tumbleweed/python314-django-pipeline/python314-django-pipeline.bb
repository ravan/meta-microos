SUMMARY = "An asset packaging library for Django"
DESCRIPTION = "Pipeline is an asset packaging library for Django, providing both CSS and \
JavaScript concatenation and compression, built-in JavaScript template support, \
and optional data-URI image and font embedding."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python314-django-pipeline-4.1.0-2.1.noarch.rpm"
RPM_HASH = "af43d681537165bafd5df2630fafa54f1ba079a50935e0bf9ec4b49cd3b86813bbcfadfdf04ea9c44f02e1dee7038bd0b59f4e6916165e296b522569f4375979"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-pipeline \
python314-django-pipeline \
python3dist-django-pipeline"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
