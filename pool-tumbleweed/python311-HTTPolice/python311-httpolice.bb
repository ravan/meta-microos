SUMMARY = "Validator for HTTP"
DESCRIPTION = "HTTPolice is a validator or linter for HTTP requests and responses. \
It can spot bad header syntax, inappropriate status codes, and other potential \
problems in your HTTP server or client."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python311-HTTPolice-0.9.0-5.3.noarch.rpm"
RPM_HASH = "b322c841666905f89837828ff735700fb3cb4829d47650393132700eb58ab257fef59d23d75ad79bfe17d91b3aa7473628317d6f31ec498cfa23b1d68ca11505"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-httpolice \
python311-HTTPolice \
python3dist-httpolice"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Brotli \
python311-bitstring \
python311-defusedxml \
python311-dominate \
python311-lxml \
update-alternatives"

inherit rpm
