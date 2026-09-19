SUMMARY = "Validator for HTTP"
DESCRIPTION = "HTTPolice is a validator or linter for HTTP requests and responses. \
It can spot bad header syntax, inappropriate status codes, and other potential \
problems in your HTTP server or client."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python313-HTTPolice-0.9.0-5.5.noarch.rpm"
RPM_HASH = "5155d9b2953ace9ea5d00e98593ca8290af27436650f854f073859f710e3d7e2233f610a92e060fa211bc1f5f04da258cafc86377c257458b2ca1cb319d30b3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-HTTPolice \
python3.13dist-httpolice \
python313-HTTPolice \
python3dist-httpolice"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Brotli \
python313-bitstring \
python313-defusedxml \
python313-dominate \
python313-lxml \
update-alternatives"

inherit rpm
