SUMMARY = "Detect platforms and group them by family"
DESCRIPTION = "Detect platforms and group them by family"
LICENSE = "Apache-2.0"

PV = "13.6.0"

RPM_NAME = "python313-extra-platforms-13.6.0-1.1.noarch.rpm"
RPM_HASH = "4eb2ba8aab099c9c0e60bbf19191076a4a6715641dfddcc16d164a9ac1e1eb797fd38a7cce2df6cd2b91785e35bb531ea4f24ee29281f91b6c1bc3322d29c26e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-extra-platforms \
python3.13dist-extra-platforms \
python313-extra-platforms \
python3dist-extra-platforms"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
