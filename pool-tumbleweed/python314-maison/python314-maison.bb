SUMMARY = "Read settings from config files"
DESCRIPTION = "`maison` aims to provide a simple and flexible way to read and validate those \
configuration options so that they may be used in the package."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python314-maison-2.0.2-1.2.noarch.rpm"
RPM_HASH = "2266ac570cca5ee43cd246d179583b07ce4621a0b5c4fb32d1545555666d0ce85e91101e6f1b97271c531566b514498c166f9fa5f608443ae1b54f6e2102b36e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-maison \
python314-maison \
python3dist-maison"

RDEPENDS:${PN} += "python-abi \
python314-loguru \
python314-platformdirs \
python314-typer \
python314-typing-extensions"

inherit rpm
