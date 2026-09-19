SUMMARY = "API documentation for assertj-core"
DESCRIPTION = "This package provides API documentation for assertj-core."
LICENSE = "Apache-2.0"

PV = "3.27.7"

RPM_NAME = "assertj-core-javadoc-3.27.7-1.4.noarch.rpm"
RPM_HASH = "ba34fd3a4bd154a61b78992f3d1c249a96093412f6251d5fe441608adebcf9d42a53f04e101b07202b58204b1afd83e23415aeca2054edbfb55578cfbd6ee1b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "assertj-core-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
