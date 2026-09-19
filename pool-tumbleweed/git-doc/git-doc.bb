SUMMARY = "Documentation for the Git version control system"
DESCRIPTION = "Git is a fast, scalable, distributed revision control system with an \
unusually rich command set that provides both high-level operations and \
full access to internals. \
 \
This subpackage contains Git's documentation in text/plain and \
text/html formats. (The manpages are in the main package.)"
LICENSE = "GPL-2.0-only"

PV = "2.55.0"

RPM_NAME = "git-doc-2.55.0-3.2.noarch.rpm"
RPM_HASH = "b785f569eb3dace7d6eb4286653452ae1c0d9912dbfa4fb9df8cc089ab364dba170794885d53bac85dbd0a4a7eca928be45310efe012f64c2b851c10f27e8a1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-doc"

RDEPENDS:${PN} += ""

inherit rpm
