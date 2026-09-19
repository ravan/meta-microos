SUMMARY = "Format a simple (i.e. not nested) list into aligned columns"
DESCRIPTION = "Format a simple (i.e. not nested) list into aligned columns."
LICENSE = "MIT"

PV = "0.3.11"

RPM_NAME = "python314-columnize-0.3.11-2.5.noarch.rpm"
RPM_HASH = "016b912ffe6721350f915f5b316eb4e7391139f5ab3c75d87052bd40dadff64975a0167bd55453338ff6305f8f041e8c54310a53275c1dacad0437ce741341ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-columnize \
python314-columnize \
python3dist-columnize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
