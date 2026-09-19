SUMMARY = "MkDocs extension that lists all dependencies according to a mkdocsyml file"
DESCRIPTION = "An extra command for MkDocs that infers required PyPI packages from plugins in mkdocs.yml."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python313-mkdocs-get-deps-0.2.2-1.4.noarch.rpm"
RPM_HASH = "84c67a7908d6ccbb67f5fc09a81f6fc63536645fdf26af4f0d8f107dd969f8e25fdde49988f1eeeb200652da692a7309fa9cb03bd3626c8c0ff12da33563de30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mkdocs-get-deps \
python3.13dist-mkdocs-get-deps \
python313-mkdocs-get-deps \
python3dist-mkdocs-get-deps"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-PyYAML \
python313-mergedeep \
python313-platformdirs \
update-alternatives"

inherit rpm
