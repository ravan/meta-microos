SUMMARY = "Javadoc for pentaho-reporting-flow-engine"
DESCRIPTION = "Javadoc for pentaho-reporting-flow-engine."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.4"

RPM_NAME = "pentaho-reporting-flow-engine-javadoc-0.9.4-6.17.noarch.rpm"
RPM_HASH = "210d22e556f9ad7a30c301efa4e52b52577818b260243fef41b383413a1d7354d08bf091c9b599b6c5fd3e127d4445e2d03518c4e2e47507229e2f0851add6e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pentaho-reporting-flow-engine-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
