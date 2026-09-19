SUMMARY = "Filesystem Hierarchy Standard"
DESCRIPTION = "This standard consists of a set of requirements and guidelines for file \
and directory placement under UNIX-like operating systems.  The \
guidelines are intended to support application interoperability, system \
administration tools, development tools, and scripts as well as greater \
uniformity of documentation for these systems."
LICENSE = "SUSE-FHS"

PV = "3.0"

RPM_NAME = "fhs-3.0-1.14.noarch.rpm"
RPM_HASH = "0345988f77885f73f4ff6222e0f396e05cfad24b8933d152dc20248ade1b5ecf300c68e40fd1a55affea0e145921485751e2265390c8ba70c0dc4b1f34d5d1af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fhs"

RDEPENDS:${PN} += ""

inherit rpm
