SUMMARY = "A tool to show calendar event details in Mutt"
DESCRIPTION = "A tool to show calendar event details in Mutt."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python313-mutt-ics-0.9.2-5.5.noarch.rpm"
RPM_HASH = "f1ef9e115c74bda5af89bcd318897d525544d5c13c40487c41391cf49f23c93ac902ed4509add2395e2f3cae2bad20bbc13a22139fdea4606d83144da28256ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mutt-ics \
python3-mutt-ics \
python3.13dist-mutt-ics \
python313-mutt-ics \
python3dist-mutt-ics"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-icalendar \
python313-setuptools"

inherit rpm
