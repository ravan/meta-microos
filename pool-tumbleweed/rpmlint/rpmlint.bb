SUMMARY = "RPM file correctness checker"
DESCRIPTION = "rpmlint is a tool to check common errors on RPM packages. Binary and \
source packages can be checked."
LICENSE = "GPL-2.0-or-later"

PV = "2.10.0+git20260911.f4f012f3"

RPM_NAME = "rpmlint-2.10.0+git20260911.f4f012f3-1.1.noarch.rpm"
RPM_HASH = "7aa16cde02f735856c25d0b067b527c6f5671fb86e1c4baa18652fd78b28648e1251c3e5991dc7c889ea1b4a40ed2dd2ee73dd3923ad4a68c52620cfed02f220"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-rpmlint \
python3.13dist-rpmlint \
python3dist-rpmlint \
rpmlint"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
appstream-glib \
bash \
binutils \
checkbashisms \
cpio \
dash \
desktop-file-utils \
file \
findutils \
myspell-en-US \
python-abi \
python3-pybeam \
python3-pyenchant \
python3-python-magic \
python3-pyxdg \
python3-rpm \
python3-tomli-w \
python3-zstandard \
rpm-build"

inherit rpm
