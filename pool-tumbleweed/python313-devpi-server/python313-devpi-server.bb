SUMMARY = "Private PyPI caching server"
DESCRIPTION = "A private PyPI caching server, providing user or team based indices which can \
inherit packages from each other or from the pypi.org site."
LICENSE = "MIT"

PV = "6.20.3"

RPM_NAME = "python313-devpi-server-6.20.3-1.1.noarch.rpm"
RPM_HASH = "16e13456a79c9d16184fd6ae0613989c9cbabfec5c7cb707b06b5869229af07ea3885981bfd4a9113606a07a88bcb4380bc343559620f52a623506a5eefa863b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-devpi-server \
python3.13dist-devpi-server \
python313-devpi-server \
python3dist-devpi-server"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-argon2-cffi \
python313-attrs \
python313-defusedxml \
python313-devpi-common \
python313-httpx \
python313-itsdangerous \
python313-lazy \
python313-legacy-cgi \
python313-passlib \
python313-platformdirs \
python313-pluggy \
python313-py \
python313-pyramid \
python313-repoze.lru \
python313-requests \
python313-ruamel.yaml \
python313-setuptools \
python313-strictyaml \
python313-waitress"

inherit rpm
