SUMMARY = "Python parser/generator of iCalendar files package"
DESCRIPTION = "The iCalendar package is a parser/generator of iCalendar files for use \
with Python. It follows the RFC 2445 (iCalendar) specification."
LICENSE = "BSD-2-Clause"

PV = "7.3.0"

RPM_NAME = "python313-icalendar-7.3.0-1.1.noarch.rpm"
RPM_HASH = "c40834ce89a65048fe894923898ca5622d20f4daa0ddff8e2eff7816964d8bbf2cf155246a5f32a06227ea7776ae9ff73dee9a00d325e80937ddefa10259ab4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-icalendar \
python3-icalendar-doc \
python3.13dist-icalendar \
python313-icalendar \
python313-icalendar-doc \
python3dist-icalendar"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-python-dateutil \
python313-tzdata \
update-alternatives"

inherit rpm
