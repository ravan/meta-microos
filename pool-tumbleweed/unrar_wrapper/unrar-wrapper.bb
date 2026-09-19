SUMMARY = "Backwards compatibility between unar and unrar"
DESCRIPTION = "Wrapper python script that transforms the basic UnRAR commands to unar \
and lsar calls in order to provide a backwards compatibility."
LICENSE = "GPL-3.0-only"

PV = "1.0.0"

RPM_NAME = "unrar_wrapper-1.0.0-7.1.noarch.rpm"
RPM_HASH = "683f81814a25b3950ec1286ccf4358d03a0962e3dd8a294722e740a0492a623a11b6b07e313d02f82acdf1b8fed8e05de37de895409ffc61c70dedecd2a4d802"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-unrar-wrapper \
python3dist-unrar-wrapper \
unrar \
unrar-wrapper"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-setuptools \
unar"

inherit rpm
