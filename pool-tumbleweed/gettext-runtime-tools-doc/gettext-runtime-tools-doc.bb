SUMMARY = "HTML documentation and examples for gettext-runtime"
DESCRIPTION = "This subpackage contains the HTML version of the gettext documentation \
as well as project examples."
LICENSE = "GPL-3.0-or-later & LGPL-2.0-or-later"

PV = "1.0"

RPM_NAME = "gettext-runtime-tools-doc-1.0-2.4.noarch.rpm"
RPM_HASH = "39a846b8be0b4f0694a7ba04e14290155c2df2b8d0f53d447d8233521df04e0c73c8b726631e0760a890858d015ff0012f33486f029f897e6bc2b94946fe07d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gettext-runtime-tools-doc"

RDEPENDS:${PN} += ""

inherit rpm
