SUMMARY = "Implements a lazy string for python useful for use with gettext"
DESCRIPTION = "A module that provides lazy strings for translations.  Basically you \
get an object that appears to be a string but changes the value every \
time the value is evaluated based on a callable you provide."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "python313-speaklater-1.3-4.5.noarch.rpm"
RPM_HASH = "c20713d7e1ab99569174d6183427fe5a5b05f5a1e5cbade8109953b05e5cdadd5114c22c291d8774fdc788b814930e15198c4cc79c249b60ba7a5aea32eb1e17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-speaklater \
python3.13dist-speaklater \
python313-speaklater \
python3dist-speaklater"

RDEPENDS:${PN} += "python-abi"

inherit rpm
