SUMMARY = "Upstream branding for Firefox"
DESCRIPTION = "This package provides upstream look and feel for Firefox."
LICENSE = "MPL-2.0"

PV = "154.0"

RPM_NAME = "MozillaFirefox-branding-upstream-154.0-1.2.aarch64.rpm"
RPM_HASH = "de2dc4bd77d4d92ae00798aef694256a2961c9c9c9bd7df317452cce75ea8d37b95adf6a3dc8d87b4aa12899a1f2c06f3feddde50eea897d663c73601a1efc7a"

RPROVIDES:${PN} += "MozillaFirefox-branding \
MozillaFirefox-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
