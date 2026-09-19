SUMMARY = "Django package to send push notifications to mobile devices"
DESCRIPTION = "Send push notifications to mobile devices through GCM, APNS or WNS and \
to WebPush (Chrome, Firefox and Opera) in Django."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python314-django-push-notifications-3.0.2-2.8.noarch.rpm"
RPM_HASH = "09103326169172730eea69c10a8e443466cc4ed138946b3821512ec44a93c905c56a5d6149b251749c38ce1a9927492f528bc1930d1761475e3ba191f065f6e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-push-notifications \
python314-django-push-notifications \
python3dist-django-push-notifications"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-pywebpush"

inherit rpm
