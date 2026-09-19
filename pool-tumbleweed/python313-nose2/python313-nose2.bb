SUMMARY = "The successor to the Python testing framework nose, based on unittest"
DESCRIPTION = "nose2 is the successor to nose. It's unittest with plugins. \
nose2 is a new project and does not support all of the behaviors of nose. \
nose2's purpose is to extend unittest to make testing nicer and easier to understand."
LICENSE = "BSD-2-Clause & Python-2.0"

PV = "0.16.0"

RPM_NAME = "python313-nose2-0.16.0-1.3.noarch.rpm"
RPM_HASH = "a51a098115388931c209f218433ec5c31148f2e8b77c3902c309fa5cfb416205037c8b8e53a2623a4a1c979493117d412cd649928de5ff0cfa5d58290b7eae9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nose2 \
python3.13dist-nose2 \
python313-nose2 \
python3dist-nose2"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
