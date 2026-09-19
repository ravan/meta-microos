SUMMARY = "Python parser/generator of iCalendar files package"
DESCRIPTION = "The iCalendar package is a parser/generator of iCalendar files for use \
with Python. It follows the RFC 2445 (iCalendar) specification."
LICENSE = "BSD-2-Clause"

PV = "7.3.0"

RPM_NAME = "python314-icalendar-7.3.0-1.1.noarch.rpm"
RPM_HASH = "dbf84da3d29aeff071b2a6a17122a678b75e3c79886d97e5f48b3bd0a11d2c6261de8ad21ffea03bbd6656aecacc971bd82b1147ff30fcbf6b12b2c6f385a079"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-icalendar \
python314-icalendar \
python314-icalendar-doc \
python3dist-icalendar"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-python-dateutil \
python314-tzdata \
update-alternatives"

inherit rpm
