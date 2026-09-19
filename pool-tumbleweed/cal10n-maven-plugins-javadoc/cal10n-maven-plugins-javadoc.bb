SUMMARY = "Javadoc for cal10n-maven-plugins"
DESCRIPTION = "API documentation for cal10n-maven-plugins."
LICENSE = "MIT"

PV = "0.8.1.12"

RPM_NAME = "cal10n-maven-plugins-javadoc-0.8.1.12-2.7.noarch.rpm"
RPM_HASH = "85beb3896612b8b178c95b1cad9c818511dda1b8da5c44639f5b40221d107725a8616a29b816de480bf015837c2087a8f9f101c0c753ec0af87d03eba747060f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cal10n-maven-plugins-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
