SUMMARY = "Python at the shell"
DESCRIPTION = "Easily run Python at the shell! Magical, but never mysterious. \
 \
See README.md or https://github.com/hauntsaninja/pyp for examples."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python314-pyp-1.3.0-2.4.noarch.rpm"
RPM_HASH = "fb0ea3a52743d7a96a702abc7f40a1750012637bb6769a79811fe35e7e11c986d8cd857a6dd6c99b42746fd1f4b845fee954a21b3cd3891c1727065b2f9a99ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pypyp \
python314-pyp \
python3dist-pypyp"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-astunparse \
update-alternatives"

inherit rpm
