SUMMARY = "The Linode command-line interface"
DESCRIPTION = "The Linode Command Line interface"
LICENSE = "BSD-3-Clause"

PV = "5.65.0"

RPM_NAME = "python313-linode-cli-5.65.0-1.3.noarch.rpm"
RPM_HASH = "9c0ccce1183e7011a16152460432fd552452686506c0a1d92b22aa1a02b9a204759fa1d1535a6912553eaaf83e34d45d66205d7600412f87219ea8c2c4f56ad7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-linode-cli \
python3.13dist-linode-cli \
python313-linode-cli \
python3dist-linode-cli"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-PyYAML \
python313-linode-metadata \
python313-openapi3 \
python313-packaging \
python313-pytimeparse \
python313-requests \
python313-rich \
update-alternatives"

inherit rpm
