SUMMARY = "A tool to show calendar event details in Mutt"
DESCRIPTION = "A tool to show calendar event details in Mutt."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python314-mutt-ics-0.9.2-5.5.noarch.rpm"
RPM_HASH = "861136984cc83fc1c27b0224e4e8f8ba80a69ef70e9b19b100182bdca05d0d517c1f4d1288de6eef320d9e0f58a69994aa00da313fa0f34d6c6106257a618ff1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mutt-ics \
python3.14dist-mutt-ics \
python314-mutt-ics \
python3dist-mutt-ics"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-icalendar \
python314-setuptools"

inherit rpm
