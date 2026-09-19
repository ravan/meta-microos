SUMMARY = "Text to activity-diagram image generator"
DESCRIPTION = "actdiag generates activity-diagram image files from spec-text files."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python313-actdiag-3.0.0-5.5.noarch.rpm"
RPM_HASH = "eda7bef9581902dad8b82b589ebbc1a8d70ed3c91ce3def479b56d4ee405f8da71fafb33a1e95428fff3aeb01399dac8c6c502a52cc4692dd4148758e2f613be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-actdiag \
python3.13dist-actdiag \
python313-actdiag \
python3dist-actdiag"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-blockdiag"

inherit rpm
