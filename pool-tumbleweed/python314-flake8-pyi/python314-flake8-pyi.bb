SUMMARY = "A plugin for flake8 to enable linting .pyi files"
DESCRIPTION = "A plugin for Flake8 that provides specializations for type hinting stub \
files. Especially interesting for linting typeshed."
LICENSE = "MIT"

PV = "26.5.0"

RPM_NAME = "python314-flake8-pyi-26.5.0-1.2.noarch.rpm"
RPM_HASH = "6c6fe457cfea54a1b275a4c397db7448bab023cbd927ee7ec7e55de3a1587437ecd3d9880e8b0f3197cec146b4cda91dc1d1ea9f1656735d99aeb7ced6a25dab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flake8-pyi \
python314-flake8-pyi \
python3dist-flake8-pyi"

RDEPENDS:${PN} += "python-abi \
python314-base \
python314-flake8 \
python314-pyflakes"

inherit rpm
