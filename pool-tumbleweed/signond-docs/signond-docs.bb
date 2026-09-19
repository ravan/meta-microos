SUMMARY = "Single Sign On Framework - Documentation"
DESCRIPTION = "This package contains the documentation for signond."
LICENSE = "LGPL-2.0-only"

PV = "8.61"

RPM_NAME = "signond-docs-8.61-2.10.noarch.rpm"
RPM_HASH = "292e67f7a2e2bc44cb9e3352ab83263aaad21bf16a7e45e5de4ba1b6c840db18fda81f3eb1e00c24f2d891ada5628230b4f5dfc3fa31712f915a53110cf873a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "signond-docs"

RDEPENDS:${PN} += ""

inherit rpm
