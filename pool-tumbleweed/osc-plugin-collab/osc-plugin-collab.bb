SUMMARY = "Plugin to make collaboration easier with osc"
DESCRIPTION = "This osc plugin extends osc with commands that makes it easier to use \
the collaboration feature in the Build Service, and to keep up with \
latest upstream versions."
LICENSE = "BSD-3-Clause"

PV = "0.104+30"

RPM_NAME = "osc-plugin-collab-0.104+30-1.9.noarch.rpm"
RPM_HASH = "2e24efdd923a0f9613d74b0347beaa3629dff51257921dc340cfbed91fc575645c54d3654abc8a94508d1032020ad8820c5e699a54f5265595f2e320ad85a2b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "osc-plugin-collab"

RDEPENDS:${PN} += "osc"

inherit rpm
