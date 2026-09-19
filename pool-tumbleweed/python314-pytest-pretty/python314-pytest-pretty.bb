SUMMARY = "Pytest plugin for printing summary data as I want it"
DESCRIPTION = "Opinionated pytest plugin to make output slightly easier to read \
and errors easy to find and fix."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python314-pytest-pretty-1.3.0-1.5.noarch.rpm"
RPM_HASH = "75568afd303c160e9ce226bf6941ab1500010a127dda514d9c0524b3e09ef2fa97e499311ef60ce2046be0004bbdbdae9dadfdf77a7725f0ea080f7219f4d566"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-pretty \
python314-pytest-pretty \
python3dist-pytest-pretty"

RDEPENDS:${PN} += "python-abi \
python314-pytest \
python314-rich"

inherit rpm
