SUMMARY = "Python library for .env support"
DESCRIPTION = "Add .env support to your Django/Flask apps in development and deployments."
LICENSE = "BSD-3-Clause"

PV = "1.2.2"

RPM_NAME = "python313-python-dotenv-1.2.2-1.3.noarch.rpm"
RPM_HASH = "3218be0d2e647ce0783f80148d0ba2f1d6c0cb50c036bf7ae12447dfb0be043c8332f47e16a7c752c6e9473b50cacd63275d9b18f306140f8a185416ca32a474"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-dotenv \
python3.13dist-python-dotenv \
python313-python-dotenv \
python3dist-python-dotenv"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-click"

inherit rpm
