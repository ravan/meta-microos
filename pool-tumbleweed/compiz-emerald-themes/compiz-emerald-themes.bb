SUMMARY = "Various themes for Emerald decorator"
DESCRIPTION = "Various themes to be used with Emerald decorator of Compiz \
window/compositing manager."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compiz-emerald-themes-0.8.18-1.19.noarch.rpm"
RPM_HASH = "060db21054b287e6bde9bc9fc1e98cd29b5fe8df46103348ef11e9dc6b36c54aa3b20bf2a8e131900f93cae248bcde91b496ac3e5bcc4324ef680c090e9e3487"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "compiz-emerald-themes"

RDEPENDS:${PN} += "compiz-emerald"

inherit rpm
