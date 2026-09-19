SUMMARY = "Javadoc for picocli"
DESCRIPTION = "This package contains the API documentation for picocli."
LICENSE = "Apache-2.0"

PV = "4.7.7"

RPM_NAME = "picocli-javadoc-4.7.7-1.3.noarch.rpm"
RPM_HASH = "6b6139ea2881995032d636c9d67caedf23743f91397d0d499828d0aa9ddb92ef2cf1f5728bca710fd7fd0ae3b34a439258ebd30c2684632c94a7f0810a6f344c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "picocli-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
