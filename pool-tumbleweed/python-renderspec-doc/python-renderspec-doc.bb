SUMMARY = "Documentation for the renderspec utility"
DESCRIPTION = "Documentation for the renderspec tool which is a tool to convert \
a spec.j2 Jinja2 template into a rpm .spec file."
LICENSE = "Apache-2.0"

PV = "2.3.0"

RPM_NAME = "python-renderspec-doc-2.3.0-1.8.noarch.rpm"
RPM_HASH = "76e570271720a579529dfe2a67154b883fff667ce75714204d6f3c1296d7a14a44c0ccbd6c231d67565357bc6078a414b6297f7bba9a510852ae25840ed57ac6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-renderspec-doc"

RDEPENDS:${PN} += "python3-renderspec"

inherit rpm
