SUMMARY = "A tool for authoring Sphinx themes with a simple (opinionated) workflow"
DESCRIPTION = "Streamline the Sphinx theme development workflow, by building upon \
existing standardised tools. \
 \
 * simplified packaging experience \
 * simplified JavaScript tooling setup \
 * development server, with rebuild-on-save and automagical browser reloading \
 * consistent repository structure across themes"
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python314-sphinx-theme-builder-0.3.2-1.2.noarch.rpm"
RPM_HASH = "c4ab92a94f8af7f89dbf1aa2d45cfba088b6b864e445374949991a108831d40297293e39921e830b621015f791fa6ae88da0411dbda1e8c998575517e87b32f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinx-theme-builder \
python314-sphinx-theme-builder \
python3dist-sphinx-theme-builder"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-build \
python314-click \
python314-diagnostic \
python314-nodeenv \
python314-packaging \
python314-pyproject-metadata \
python314-rich \
python314-setuptools \
python314-sphinx-autobuild \
update-alternatives"

inherit rpm
