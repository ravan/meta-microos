SUMMARY = "Hypothesis extension for generating filesystem paths"
DESCRIPTION = "Hypothesis extension for generating filesystem paths"
LICENSE = "MIT"

PV = "0.1"

RPM_NAME = "python314-hypothesis-fspaths-0.1-3.5.noarch.rpm"
RPM_HASH = "a30f90b895329464244436eda8397afe7f00760342374b4e6dc6604e737b9bf9edeed5826320a35d6863d7e15095f22d611af4d5592d144f72a4057c7f517248"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hypothesis-fspaths \
python314-hypothesis-fspaths \
python3dist-hypothesis-fspaths"

RDEPENDS:${PN} += "python-abi \
python314-hypothesis"

inherit rpm
