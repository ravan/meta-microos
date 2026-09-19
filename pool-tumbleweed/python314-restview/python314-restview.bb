SUMMARY = "ReStructuredText viewer"
DESCRIPTION = "A viewer for ReStructuredText documents that renders them on the fly."
LICENSE = "GPL-3.0-only"

PV = "3.0.2"

RPM_NAME = "python314-restview-3.0.2-1.2.noarch.rpm"
RPM_HASH = "3df349073ebc95842d5f01538b46937410d5f7b60d9bd5d391949271c48dc4d70696786204c20b4ba196ddc1d430d979087c2f0fb056098fcf5c3c60c83daaf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-restview \
python314-restview \
python3dist-restview"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-docutils \
python314-pygments \
python314-readme-renderer"

inherit rpm
