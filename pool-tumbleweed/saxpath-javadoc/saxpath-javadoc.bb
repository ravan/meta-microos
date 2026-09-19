SUMMARY = "API documentation for saxpath"
DESCRIPTION = "This package contains API documentation for saxpath."
LICENSE = "Saxpath"

PV = "1.0"

RPM_NAME = "saxpath-javadoc-1.0-2.8.noarch.rpm"
RPM_HASH = "66b8bb8d2145cf0867cf973920b4448c98be8fa4285f677219e6d44b5fe22564af29754465a2d6f462c73e760a3f5f46aea1e4e867301d2653831257caa5f12f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxpath-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
