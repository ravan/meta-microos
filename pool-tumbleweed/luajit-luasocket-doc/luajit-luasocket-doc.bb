SUMMARY = "Documentation for luajit-luasocket"
DESCRIPTION = "This subpackage contains documentation for luajit-luasocket."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "luajit-luasocket-doc-3.1.0-5.3.noarch.rpm"
RPM_HASH = "af26e498f696f8a4101e9ca0594c74487f7247c405514537550ef0824b1512c5aa4ac05d0bc969dc5d55a3fcfc9ffc930be1b4f1beef2f07a96497e2eb4e588d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-luasocket-doc"

RDEPENDS:${PN} += ""

inherit rpm
