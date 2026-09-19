SUMMARY = "A library for creating and verifying challenges for ALTCHA"
DESCRIPTION = "The ALTCHA Python Library is a lightweight, zero-dependency library designed \
for creating and verifying [ALTCHA](https://altcha.org) challenges, \
specifically tailored for Python applications."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python313-altcha-2.1.0-1.1.noarch.rpm"
RPM_HASH = "afab60fff900b5c41d6641af2924d28fcec9841d931382204ad39e2931c258cef2fbad00fa6fe91fdbc430848bbc3f1fd20782667d0974640d46883873342986"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-altcha \
python3.13dist-altcha \
python313-altcha \
python3dist-altcha"

RDEPENDS:${PN} += "python-abi"

inherit rpm
