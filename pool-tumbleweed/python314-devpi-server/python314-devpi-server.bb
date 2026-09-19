SUMMARY = "Private PyPI caching server"
DESCRIPTION = "A private PyPI caching server, providing user or team based indices which can \
inherit packages from each other or from the pypi.org site."
LICENSE = "MIT"

PV = "6.20.3"

RPM_NAME = "python314-devpi-server-6.20.3-1.1.noarch.rpm"
RPM_HASH = "bbc9021e77238a9edf284da962c65aa902cb2a8c8df0d9862992f6e3689c2cfd6428e4956cb80599d6588b558f3a14e4af0c63b9f1a4edb60f8a0b7a736d2ef8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-devpi-server \
python314-devpi-server \
python3dist-devpi-server"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-argon2-cffi \
python314-attrs \
python314-defusedxml \
python314-devpi-common \
python314-httpx \
python314-itsdangerous \
python314-lazy \
python314-legacy-cgi \
python314-passlib \
python314-platformdirs \
python314-pluggy \
python314-py \
python314-pyramid \
python314-repoze.lru \
python314-requests \
python314-ruamel.yaml \
python314-setuptools \
python314-strictyaml \
python314-waitress"

inherit rpm
