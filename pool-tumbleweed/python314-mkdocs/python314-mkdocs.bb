SUMMARY = "Project documentation with Markdown"
DESCRIPTION = "MkDocs is a static site generator for building project documentation. \
Documentation source files are written in Markdown, and configured \
with a single YAML configuration file."
LICENSE = "BSD-2-Clause"

PV = "1.6.1"

RPM_NAME = "python314-mkdocs-1.6.1-1.10.noarch.rpm"
RPM_HASH = "60e1cf1c71ad281846eac38b90449fa7e68bcfc6b1e3fb5f9dd772a14dc97cf5160916d2c121ec0c547bdddb51387993e78bbf8ba6f68e9fdd38df376423dcb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mkdocs \
python314-mkdocs \
python3dist-mkdocs"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
fontawesome-fonts \
fontawesome-fonts-web \
python-abi \
python314-Jinja2 \
python314-Markdown \
python314-MarkupSafe \
python314-PyYAML \
python314-click \
python314-ghp-import \
python314-importlib-metadata \
python314-mergedeep \
python314-mkdocs-get-deps \
python314-packaging \
python314-pathspec \
python314-pyyaml-env-tag \
python314-watchdog \
update-alternatives"

inherit rpm
