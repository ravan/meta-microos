SUMMARY = "A plugin for flake8 to enable linting .pyi files"
DESCRIPTION = "A plugin for Flake8 that provides specializations for type hinting stub \
files. Especially interesting for linting typeshed."
LICENSE = "MIT"

PV = "26.5.0"

RPM_NAME = "python313-flake8-pyi-26.5.0-1.2.noarch.rpm"
RPM_HASH = "126a1f01d416922f7ace4de5218c07531eb1f4bfdddbe102b6c67df490bece5931458c0de5b984f6dd2ed5e9bda3f82808b9132150cc285da7ba2f25d5034738"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-pyi \
python3.13dist-flake8-pyi \
python313-flake8-pyi \
python3dist-flake8-pyi"

RDEPENDS:${PN} += "python-abi \
python313-base \
python313-flake8 \
python313-pyflakes"

inherit rpm
