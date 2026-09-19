SUMMARY = "Documentation for lua53-cffi-lua"
DESCRIPTION = "This subpackage contains documentation for lua53-cffi-lua."
LICENSE = "MIT"

PV = "0.2.3+git.1769216057.4c6197f"

RPM_NAME = "lua53-cffi-lua-doc-0.2.3+git.1769216057.4c6197f-1.4.noarch.rpm"
RPM_HASH = "aaf140ac2926740fbe92f4d580789c751c1b86e083b8db4e4f57d13a19abe338f52a04878a1c2a278ce5a57074881e110ce3586f71b979a818b5d35b6ea63827"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-cffi-lua-doc"

RDEPENDS:${PN} += ""

inherit rpm
