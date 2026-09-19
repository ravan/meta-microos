SUMMARY = "Validator for HTTP"
DESCRIPTION = "HTTPolice is a validator or linter for HTTP requests and responses. \
It can spot bad header syntax, inappropriate status codes, and other potential \
problems in your HTTP server or client."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python314-HTTPolice-0.9.0-5.5.noarch.rpm"
RPM_HASH = "e828505a131da29fd25b418d38128c00404450acbe52f24ea596fa11b94050f8a22fa157143ce4ed1a0d08e025e7bce64de9be6041c51a13cde7de24c5281da8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-httpolice \
python314-HTTPolice \
python3dist-httpolice"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Brotli \
python314-bitstring \
python314-defusedxml \
python314-dominate \
python314-lxml \
update-alternatives"

inherit rpm
