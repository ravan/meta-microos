SUMMARY = "One version package to rule them all"
DESCRIPTION = "One version package to rule them all, One version package to find them, One version package to bring them all, and in the darkness bind them. \
 \
Make anything a version object, and compare against a vast section of other version formats."
LICENSE = "MIT"

PV = "25.8.0"

RPM_NAME = "python314-awesomeversion-25.8.0-1.5.noarch.rpm"
RPM_HASH = "2782a33796232d0b7a6c9ef269666883c4fea2aa548c2c11ad662a1998268001380fcef9c63defd42d7408aeb2265831955a9fb8f2448cced8cc22139a417157"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-awesomeversion \
python314-awesomeversion \
python3dist-awesomeversion"

RDEPENDS:${PN} += "python-abi"

inherit rpm
