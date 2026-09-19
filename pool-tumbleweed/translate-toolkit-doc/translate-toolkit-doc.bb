SUMMARY = "Tools and API to assist with translation and software localization -- HTML docs"
DESCRIPTION = "The translate-toolkit-doc package contains Translate Toolkit documentation in HTML format."
LICENSE = "GPL-2.0-or-later"

PV = "3.19.9"

RPM_NAME = "translate-toolkit-doc-3.19.9-1.2.noarch.rpm"
RPM_HASH = "f8a800732544566914f9b179507317b66d788328a397ffd124cc1bcb6f6a2b378de0ca3837e585723932ec71593356ba287be8357fe74151459b4e85e8cf181b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "translate-toolkit-doc"

RDEPENDS:${PN} += "translate-toolkit"

inherit rpm
