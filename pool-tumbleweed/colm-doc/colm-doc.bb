SUMMARY = "Documentation for the Colm programming language"
DESCRIPTION = "Colm is a programming language designed for the analysis and \
transformation of computer languages. \
 \
This subpackage contains the documentation in HTML format."
LICENSE = "MIT"

PV = "0.14.7"

RPM_NAME = "colm-doc-0.14.7-2.16.noarch.rpm"
RPM_HASH = "d34947167f15f5782eb1c9f6c58748f8c16cd32ac494b0ed9fbdbb02faa1978848fe158f74c16ef2a101ca3c195914b35f4a9ffd33959a92fb2dc023aabba1b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "colm-doc"

RDEPENDS:${PN} += ""

inherit rpm
