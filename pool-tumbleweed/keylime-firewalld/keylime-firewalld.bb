SUMMARY = "Firewalld service file for keylime"
DESCRIPTION = "Subpackage of keylime for the firewalld XML service file."
LICENSE = "Apache-2.0 & MIT & BSD-3-Clause"

PV = "7.14.3"

RPM_NAME = "keylime-firewalld-7.14.3-1.1.noarch.rpm"
RPM_HASH = "8cfe41358cb1d6184451e2ba6d97ef944c2a835c178ad5c39cf1c20a67f04554d08a06feb5a642ce76602246010b0a06125354e7e79ee8e5098e370d708f892c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-firewalld"

RDEPENDS:${PN} += "/usr/bin/sh \
python3-keylime"

inherit rpm
