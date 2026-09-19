SUMMARY = "A Django Debug Toolbar panel for Requests"
DESCRIPTION = "Django Requests Debug Toolbar tracks all HTTP requests made with the popular \
requests library."
LICENSE = "MIT"

PV = "0.0.7"

RPM_NAME = "python313-django-requests-debug-toolbar-0.0.7-2.5.noarch.rpm"
RPM_HASH = "7c5d6a2b503294edfcd55873574fea647aabe623a88aff915071d550179b8b01596a236be8901e094bae488423c27f05ed6f4b7d7586981d26919217f25e945c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-requests-debug-toolbar \
python3.13dist-django-requests-debug-toolbar \
python313-django-requests-debug-toolbar \
python3dist-django-requests-debug-toolbar"

RDEPENDS:${PN} += "python-abi"

inherit rpm
