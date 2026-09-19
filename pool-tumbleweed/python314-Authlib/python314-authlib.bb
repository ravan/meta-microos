SUMMARY = "Python library for building OAuth and OpenID Connect servers"
DESCRIPTION = "A Python library for building OAuth and OpenID Connect servers."
LICENSE = "BSD-3-Clause"

PV = "1.7.2"

RPM_NAME = "python314-Authlib-1.7.2-4.1.noarch.rpm"
RPM_HASH = "739a040c35bbbd348bcb808368fd04e40b099deda76475c5f71e2655a44cdaba2e89e0ca85dcc24e0adbb37ad1fbd66504c88dda2860eb4fb5b3c963c90a4aa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-authlib \
python314-Authlib \
python314-authlib \
python3dist-authlib"

RDEPENDS:${PN} += "python-abi \
python314-cryptography \
python314-joserfc"

inherit rpm
