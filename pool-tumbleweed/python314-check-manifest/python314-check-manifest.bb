SUMMARY = "Tool to check Python source package MANIFEST.in for completeness"
DESCRIPTION = "check-manifest is a tool for python developers to check for broken packages \
and missing files in MANIFEST."
LICENSE = "MIT"

PV = "0.51"

RPM_NAME = "python314-check-manifest-0.51-3.2.noarch.rpm"
RPM_HASH = "0f5ee79f865788b68844c95fc43cd85b943f405301686ed1b646af99046a3bcf6b51670bc8c2f3bf2acbcfaf1a197d9c8c70037db9ce014d79cc8ab9a4269078"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-check-manifest \
python314-check-manifest \
python3dist-check-manifest"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-build \
python314-setuptools"

inherit rpm
