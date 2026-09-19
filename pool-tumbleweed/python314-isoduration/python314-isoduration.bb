SUMMARY = "Operations with ISO 8601 durations"
DESCRIPTION = "ISO 8601 is most commonly known as a way to exchange datetimes in textual format. \
A lesser known aspect of the standard is the representation of durations. They \
have a shape similar to this: \
 \
    P3Y6M4DT12H30M5S \
 \
This string represents a duration of 3 years, 6 months, 4 days, 12 hours, \
30 minutes, and 5 seconds. \
 \
The state of the art of ISO 8601 duration handling in Python is more or less \
limited to what's offered by isodate. What we are trying to achieve here is to \
address the shortcomings of isodate (as described in their own Limitations section), \
and a few of our own annoyances with their interface, such as the lack of uniformity \
in their handling of types, and the use of regular expressions for parsing."
LICENSE = "ISC"

PV = "20.11.0"

RPM_NAME = "python314-isoduration-20.11.0-2.14.noarch.rpm"
RPM_HASH = "470ebaa122acd8acf2f9f0d87eda9a77530a938f69da67b2f7a5aaba4e70d8dc1a3fc287ad0f7552a014b9cc769ec2c4de9f7b941225399cd08aecdc64c32bcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-isoduration \
python314-isoduration \
python3dist-isoduration"

RDEPENDS:${PN} += "python-abi \
python314-arrow"

inherit rpm
