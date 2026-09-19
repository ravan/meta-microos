SUMMARY = "Modular Internet Client Documentation"
DESCRIPTION = "This packages provides documentation of LeechCraft core API. \
 \
It contains description of core API used for developing first-level \
LeechCraft plugins. For developing sub-plugins, please refer to \
corresponding packages (like leechcraft-azoth-doc). This documentation \
is also available online at http://doc.leechcraft.org/core/"
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-doc-0.6.70+git.18808.g3467692359-3.1.noarch.rpm"
RPM_HASH = "afc26b0fa6354ca6a8cac59065a01e4e23c832440caa346239341304c843ce218702d5093d00215ae1bc2b4abc7711646f759fa67f8e844fb8c037a1e6a96378"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "leechcraft-doc"

RDEPENDS:${PN} += ""

inherit rpm
