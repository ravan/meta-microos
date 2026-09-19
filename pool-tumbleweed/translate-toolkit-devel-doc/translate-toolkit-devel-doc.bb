SUMMARY = "Tools and API to assist with translation and software localization -- API docs"
DESCRIPTION = "The translate-toolkit-devel-doc package contains Translate Toolkit API documentation for developers wishing to build new tools for the \
toolkit or to use the libraries in other localization tools."
LICENSE = "GPL-2.0-or-later"

PV = "3.19.9"

RPM_NAME = "translate-toolkit-devel-doc-3.19.9-1.2.noarch.rpm"
RPM_HASH = "d2407f920d96b7b38f413a0f8eb464cab8a7a2c197c1504720834d1d50e27b9fa3574e15dd8a89445de3254e3368048dd58e9c2bdf28d52012b41fdc9b718e0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "translate-toolkit-devel \
translate-toolkit-devel-doc"

RDEPENDS:${PN} += "translate-toolkit \
translate-toolkit-doc"

inherit rpm
