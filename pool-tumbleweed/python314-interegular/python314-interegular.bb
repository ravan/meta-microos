SUMMARY = "A regex intersection checker"
DESCRIPTION = "A library to check a subset of Python regexes for intersections, based on \
greenery. It parses regular expressions into finite state machines and \
computes whether two or more patterns can match a common string, focusing \
on speed and compatibility with the Python re syntax."
LICENSE = "MIT"

PV = "0.3.3"

RPM_NAME = "python314-interegular-0.3.3-1.1.noarch.rpm"
RPM_HASH = "b358c0b48107343381629dbe1342c9b9df7ada9dbc1139fcdcb7a53fc7dd2b021e514610ab32549af7bbe03a9a949d2f033b328731f8d7b14cd8d7ba66ef92d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-interegular \
python314-interegular \
python3dist-interegular"

RDEPENDS:${PN} += "python-abi"

inherit rpm
