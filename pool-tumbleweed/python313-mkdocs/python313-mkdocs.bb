SUMMARY = "Project documentation with Markdown"
DESCRIPTION = "MkDocs is a static site generator for building project documentation. \
Documentation source files are written in Markdown, and configured \
with a single YAML configuration file."
LICENSE = "BSD-2-Clause"

PV = "1.6.1"

RPM_NAME = "python313-mkdocs-1.6.1-1.10.noarch.rpm"
RPM_HASH = "0b98d62475ed7b20563a760dfe2afab8405d14a1bf7f03684885951c52fd21bdd0166c9d4a72c991c0e4c57c9b246fefc8e286e4f00a537e3f8e359bb691154e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mkdocs \
python3.13dist-mkdocs \
python313-mkdocs \
python3dist-mkdocs"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
fontawesome-fonts \
fontawesome-fonts-web \
python-abi \
python313-Jinja2 \
python313-Markdown \
python313-MarkupSafe \
python313-PyYAML \
python313-click \
python313-ghp-import \
python313-importlib-metadata \
python313-mergedeep \
python313-mkdocs-get-deps \
python313-packaging \
python313-pathspec \
python313-pyyaml-env-tag \
python313-watchdog \
update-alternatives"

inherit rpm
