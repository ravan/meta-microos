SUMMARY = "Javadoc for cal10n"
DESCRIPTION = "API documentation for cal10n."
LICENSE = "MIT"

PV = "0.8.1.12"

RPM_NAME = "cal10n-javadoc-0.8.1.12-2.7.noarch.rpm"
RPM_HASH = "ca7a82a798b5cb9bd6f1508aa2e1c2620bc6f3988846cb868c482b0f515e2b0d3aba57bcc6b761386d37769331203efb6c889203b3cb94a72bfe85b9ebabce7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cal10n-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
