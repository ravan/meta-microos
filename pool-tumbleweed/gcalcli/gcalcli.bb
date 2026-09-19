SUMMARY = "Google Calendar Command Line Interface"
DESCRIPTION = "gcalcli is a Python application that allows you to access your Google \
Calendar(s) from a command line. It's easy to get your agenda, search for \
events, add new events, delete events, edit events, see recently updated \
events, and even import those annoying ICS/vCal invites from Microsoft Exchange \
and/or other sources. Additionally, gcalcli can be used as a reminder service \
and execute any application you want when an event is coming up."
LICENSE = "MIT"

PV = "4.3.0+git14.3e616f7"

RPM_NAME = "gcalcli-4.3.0+git14.3e616f7-1.6.noarch.rpm"
RPM_HASH = "132694843eb4a0e69f2da325cd71f781012d18a434b8af506cf3281e5dd271d173beb141bd8774f7a8f3e0fe8a1471285e7b072055e1c5bda5782ef5617ca4c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcalcli \
python3.13dist-gcalcli \
python3dist-gcalcli"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-dateutil \
python3-google-api-python-client \
python3-google-auth-oauthlib \
python3-parsedatetime"

inherit rpm
