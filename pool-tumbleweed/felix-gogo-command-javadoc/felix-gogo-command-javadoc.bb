SUMMARY = "Javadoc for felix-gogo-command"
DESCRIPTION = "This package contains API documentation for felix-gogo-command."
LICENSE = "Apache-2.0"

PV = "1.1.2"

RPM_NAME = "felix-gogo-command-javadoc-1.1.2-4.4.noarch.rpm"
RPM_HASH = "4b00fe5674a9f78065755a2b31ddd804d8e82d98e77b818e97e18a08da2e324dc0b831221048b403daa002bdcd4194e6abd50d71b57944dcc0012ab0abdf0f38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-gogo-command-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
