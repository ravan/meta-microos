SUMMARY = "A Django Debug Toolbar panel for Requests"
DESCRIPTION = "Django Requests Debug Toolbar tracks all HTTP requests made with the popular \
requests library."
LICENSE = "MIT"

PV = "0.0.7"

RPM_NAME = "python314-django-requests-debug-toolbar-0.0.7-2.5.noarch.rpm"
RPM_HASH = "f7d87b0e3c16814e955da40131e5e4bf70e07252835da57f56f830c8ce100ed549f3adc98ad688f652f09d4d8660cdfccb42d3220545fdaa6506c4fc64760f6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-requests-debug-toolbar \
python314-django-requests-debug-toolbar \
python3dist-django-requests-debug-toolbar"

RDEPENDS:${PN} += "python-abi"

inherit rpm
