SUMMARY = "Debug sources for package cosmic-applets"
DESCRIPTION = "Debug sources for package cosmic-applets."
LICENSE = "GPL-3.0-only"

PV = "1.0.14"

RPM_NAME = "cosmic-applet-input-sources-1.0.14-1.3.noarch.rpm"
RPM_HASH = "cdd4d781512b525fb727035404a189de2d9c4bad648f3aeedf2e3f31e3b475a5d0670ba53a4396d72e5046466ebaefa9e471d56ea3699cc3e9eeffa1af70e8d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cosmic-applet-input-sources"

RDEPENDS:${PN} += "cosmic-applets"

inherit rpm
