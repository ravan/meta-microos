SUMMARY = "Javadoc for google-errorprone"
DESCRIPTION = "This package contains the API documentation for google-errorprone."
LICENSE = "Apache-2.0"

PV = "2.26.1"

RPM_NAME = "google-errorprone-javadoc-2.26.1-2.7.noarch.rpm"
RPM_HASH = "98ce3ec511899902010dface54940ac8624e0916051dfac8ff98d6b0b28d522c74493c475a7e11f03b50ac04ee5ddfd77aebbb49118a04270f64d8ab31dc157b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-errorprone-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
