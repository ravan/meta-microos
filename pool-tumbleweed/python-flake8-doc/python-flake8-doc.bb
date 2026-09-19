SUMMARY = "Documentation files for python-flake8"
DESCRIPTION = "Flake8 is a modular extensible source code checker. \
 \
This package provides documentation for python-flake8."
LICENSE = "MIT"

PV = "7.3.0"

RPM_NAME = "python-flake8-doc-7.3.0-2.5.noarch.rpm"
RPM_HASH = "e16626c232f97e123a183cc8ef551807723048d9040c9d8b067afe86aba4c2bc09753c4a6c08f5fa6bdc4854d1c3447139b3ebf02414beaf495ce40eb9612fa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-flake8-doc"

RDEPENDS:${PN} += ""

inherit rpm
