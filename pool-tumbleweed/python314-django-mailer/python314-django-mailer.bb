SUMMARY = "A reusable Django app for queuing the sending of email"
DESCRIPTION = "A reusable Django app for queuing and throttling of email sending, scheduled sending, \
consolidation of multiple notifications into single emails and logging of mail failures."
LICENSE = "MIT"

PV = "2.3.2"

RPM_NAME = "python314-django-mailer-2.3.2-2.5.noarch.rpm"
RPM_HASH = "177ef6b3d37ff82ee63da309f8241db65ec9e2d3b59e34ff83fa2b5e4176cc5fc64fa1335a7d6cc87dec1186c79c9a6a5a13e5fd6fa02763406d22938718346e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-mailer \
python314-django-mailer \
python3dist-django-mailer"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-lockfile"

inherit rpm
