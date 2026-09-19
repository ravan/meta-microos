SUMMARY = "A minimalist production ready plugin system"
DESCRIPTION = "This is the core framework used by the pytest, tox, and devpi projects."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python312-pluggy-1.6.0-2.7.noarch.rpm"
RPM_HASH = "e7d831ad890157d22a95ccba4f13ce73aec3451330a06767844787494229e16cbf3812be36bed35e2e449f795cf5d95436c01ca1f9d3b7ee1cea8eb3280a82be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-pluggy \
python312-pluggy \
python3dist-pluggy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
