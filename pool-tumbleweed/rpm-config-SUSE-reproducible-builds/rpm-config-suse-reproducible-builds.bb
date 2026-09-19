SUMMARY = "RPM macros for reproducible-builds"
DESCRIPTION = "This package contains the RPM macros for normalizing \
more details about a build (e.g. buildhost, buildtime)"
LICENSE = "GPL-2.0-or-later"

PV = "20250904"

RPM_NAME = "rpm-config-SUSE-reproducible-builds-20250904-1.4.noarch.rpm"
RPM_HASH = "0d98007a19b55d7ca433fcc2a3efc0d7f9df919dc1d300a11044bf5953f8efb1be3191adfb06f699baf40480d3f96ac43002dd8ef498e22924b620f512299f10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm-config-SUSE-reproducible-builds \
rpm-macro--buildhost \
rpm-macro--buildtime"

RDEPENDS:${PN} += ""

inherit rpm
