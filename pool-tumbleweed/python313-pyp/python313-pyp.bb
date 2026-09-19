SUMMARY = "Python at the shell"
DESCRIPTION = "Easily run Python at the shell! Magical, but never mysterious. \
 \
See README.md or https://github.com/hauntsaninja/pyp for examples."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python313-pyp-1.3.0-2.4.noarch.rpm"
RPM_HASH = "49de7061088343a1e15504e3c803db1bac7c24babca2601e8d31949e4792f04a82ed12109149ea4f82c35d314fb7acd077c7b01ac53755a6bd1e866b8a9a166a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyp \
python3.13dist-pypyp \
python313-pyp \
python3dist-pypyp"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-astunparse \
update-alternatives"

inherit rpm
