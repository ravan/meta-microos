SUMMARY = "Python library for .env support"
DESCRIPTION = "Add .env support to your Django/Flask apps in development and deployments."
LICENSE = "BSD-3-Clause"

PV = "1.2.2"

RPM_NAME = "python314-python-dotenv-1.2.2-1.3.noarch.rpm"
RPM_HASH = "9b9f506dba7edb5effb2009f3eabc13f82300ed2909875e20f704008093a6d7105a9cfcedfe4bd8df34702ca5094a117c93a622691e4734e4e7a00fa7bb6e489"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-dotenv \
python314-python-dotenv \
python3dist-python-dotenv"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-click"

inherit rpm
