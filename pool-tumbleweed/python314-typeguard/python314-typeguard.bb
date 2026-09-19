SUMMARY = "Library for runtime checking of Python types"
DESCRIPTION = "This library provides run-time type checking for functions defined with PEP 484 argument (and return) type annotations."
LICENSE = "MIT"

PV = "4.5.2"

RPM_NAME = "python314-typeguard-4.5.2-2.1.noarch.rpm"
RPM_HASH = "9a1574799608418637e00eca96a1684c87923af6c501a16ce0ec41d4cf54e679a15121fd13fd3572721f42947993c370445cc5522fa20bee3191dd5167b7e79a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-typeguard \
python314-typeguard \
python3dist-typeguard"

RDEPENDS:${PN} += "python-abi \
python314-typing-extensions"

inherit rpm
