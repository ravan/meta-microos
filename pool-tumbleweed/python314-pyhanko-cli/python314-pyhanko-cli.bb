SUMMARY = "CLI tools for stamping and signing PDF files"
DESCRIPTION = "CLI tools for stamping and signing PDF files"
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "python314-pyhanko-cli-0.4.2-1.1.noarch.rpm"
RPM_HASH = "1b385e85b0a5eff582cfcab95314d54e7e32c8d9f1ef8f84814a48a019db840dd40eebe044178f68fe8887246c10ced6eebf118691f353e1aff2c4fc84b71dda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyhanko-cli \
python314-pyhanko-cli \
python3dist-pyhanko-cli"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-PyYAML \
python314-asn1crypto \
python314-certifi \
python314-click \
python314-platformdirs \
python314-pyhanko \
python314-pyhanko-certvalidator \
python314-tzlocal \
update-alternatives"

inherit rpm
