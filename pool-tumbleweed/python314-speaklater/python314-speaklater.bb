SUMMARY = "Implements a lazy string for python useful for use with gettext"
DESCRIPTION = "A module that provides lazy strings for translations.  Basically you \
get an object that appears to be a string but changes the value every \
time the value is evaluated based on a callable you provide."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "python314-speaklater-1.3-4.5.noarch.rpm"
RPM_HASH = "c77a78af3c9b4e397d5fe02b370766b7fdf994d37bbdb39e6bc169f9ac06ec846464e02f8712b656376a9a88c3db58a3ef673c9834524c6d9460384d24ade730"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-speaklater \
python314-speaklater \
python3dist-speaklater"

RDEPENDS:${PN} += "python-abi"

inherit rpm
