SUMMARY = "Javadoc for domtrip"
DESCRIPTION = "This package contains the API documentation for domtrip."
LICENSE = "EPL-2.0"

PV = "1.6.0"

RPM_NAME = "domtrip-javadoc-1.6.0-1.1.noarch.rpm"
RPM_HASH = "be652f0bf2793090f7085cda82fbd6d71aab65e4ddc4e12116228131d6471e8aa57e8bc3aadc79979ad14433c5ea80bb03ea5f86614f2bf60860438028d90790"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "domtrip-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
