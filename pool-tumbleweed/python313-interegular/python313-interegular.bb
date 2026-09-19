SUMMARY = "A regex intersection checker"
DESCRIPTION = "A library to check a subset of Python regexes for intersections, based on \
greenery. It parses regular expressions into finite state machines and \
computes whether two or more patterns can match a common string, focusing \
on speed and compatibility with the Python re syntax."
LICENSE = "MIT"

PV = "0.3.3"

RPM_NAME = "python313-interegular-0.3.3-1.1.noarch.rpm"
RPM_HASH = "4a0762a0887fc6c2bf5d2e6fb96994c74ff1300f12113815d8312eeed8b493f07cd0028d93ff470e84d838ce8f399c0668b8fd63448364b19b380c6c7f267378"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-interegular \
python3.13dist-interegular \
python313-interegular \
python3dist-interegular"

RDEPENDS:${PN} += "python-abi"

inherit rpm
