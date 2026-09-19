SUMMARY = "Documentation for lua55-cffi-lua"
DESCRIPTION = "This subpackage contains documentation for lua55-cffi-lua."
LICENSE = "MIT"

PV = "0.2.3+git.1769216057.4c6197f"

RPM_NAME = "lua55-cffi-lua-doc-0.2.3+git.1769216057.4c6197f-1.4.noarch.rpm"
RPM_HASH = "8331708717e6b7e7ec01e56146e198a5c84e1d244ebbca33469b0b137ac39358ef4857aa2987e6e1975f338b4df13054f11e077fe8b26a3e215912a447702239"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-cffi-lua-doc"

RDEPENDS:${PN} += ""

inherit rpm
