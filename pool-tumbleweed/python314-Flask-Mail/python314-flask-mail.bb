SUMMARY = "Flask extension for sending email"
DESCRIPTION = "A Flask extension for sending email messages."
LICENSE = "BSD-3-Clause"

PV = "0.10.0"

RPM_NAME = "python314-Flask-Mail-0.10.0-1.2.noarch.rpm"
RPM_HASH = "d24d81630fb36d43cd8af0b1b2b713f97ef6888c4f86511f98f2590b0d4f1433dffa49cd2ba8c4ff160cb672ca573983363792f2e88d67d401c461c69c23b0ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flask-mail \
python314-Flask-Mail \
python3dist-flask-mail"

RDEPENDS:${PN} += "python-abi \
python314-Flask \
python314-blinker"

inherit rpm
