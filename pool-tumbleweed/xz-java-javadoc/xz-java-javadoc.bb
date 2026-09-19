SUMMARY = "API documentation of Java XZ compression library"
DESCRIPTION = "This package contains the API documentation of xz-java."
LICENSE = "0BSD"

PV = "1.12"

RPM_NAME = "xz-java-javadoc-1.12-1.2.noarch.rpm"
RPM_HASH = "b1d15a34b92efce10b56620e9f337b6b8cc220a9179100e92deefce5afbaa66f70629b24c38d291e38a0bd788d2ab26569d43a81ef003f2e0f7516668d2590f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xz-java-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
