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

RPM_NAME = "python313-sphinx-theme-builder-0.3.2-1.2.noarch.rpm"
RPM_HASH = "fa03b8bd6cdbfaf365f59f459209e1d929fdcabfc28d47f2dc8c98b59eeda54bad532d24114c1bdedd8328382cc134a92d902d246476ce5e9ac6c7e4c0923870"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-theme-builder \
python3.13dist-sphinx-theme-builder \
python313-sphinx-theme-builder \
python3dist-sphinx-theme-builder"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-build \
python313-click \
python313-diagnostic \
python313-nodeenv \
python313-packaging \
python313-pyproject-metadata \
python313-rich \
python313-setuptools \
python313-sphinx-autobuild \
update-alternatives"

inherit rpm
