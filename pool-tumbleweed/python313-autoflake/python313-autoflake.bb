SUMMARY = "Program to removes unused Python imports and variables"
DESCRIPTION = "Autoflake removes unused imports and unused variables from Python \
code. It makes use of pyflakes to do this. \
 \
By default, autoflake only removes unused imports for modules that \
are part of the standard library. (Other modules may have side \
effects that make them unsafe to remove automatically.) Removal of \
unused variables is also disabled by default. \
 \
autoflake also removes useless pass statements."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python313-autoflake-2.3.1-2.6.noarch.rpm"
RPM_HASH = "79f4d1294793e4adb8d85a43565db91f30c138554dfef3bfed36925479bc14189661fd1d7ab69a66c61486a26841bf81eae6f8f04539c206d55bf03fbd1bcc5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-autoflake \
python3.13dist-autoflake \
python313-autoflake \
python3dist-autoflake"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-pyflakes \
python313-tomli"

inherit rpm
