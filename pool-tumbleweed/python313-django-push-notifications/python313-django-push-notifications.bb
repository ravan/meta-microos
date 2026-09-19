SUMMARY = "Django package to send push notifications to mobile devices"
DESCRIPTION = "Send push notifications to mobile devices through GCM, APNS or WNS and \
to WebPush (Chrome, Firefox and Opera) in Django."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python313-django-push-notifications-3.0.2-2.8.noarch.rpm"
RPM_HASH = "0155d78deee1abab36a3c38c00eeefe3ed681e141413f35c2f3b0ea2d014b9ae2c9027b591358f5f2eae636608d2ea34ddf7e08f43da5335de8f14b51be03874"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-push-notifications \
python3.13dist-django-push-notifications \
python313-django-push-notifications \
python3dist-django-push-notifications"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-pywebpush"

inherit rpm
