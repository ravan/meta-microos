SUMMARY = "Development files for liblockfile"
DESCRIPTION = "This library implements a number of functions found in -lmail on SysV \
systems. These functions are designed to lock the standard mailboxes in \
/var/mail (or wherever the system puts them). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of liblockfile."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.17"

RPM_NAME = "liblockfile-devel-1.17-1.12.aarch64.rpm"
RPM_HASH = "58df2c7a693fb65611773f52cd33349843fb4270d5fe3e4e21ac9ec354f337bd2f97861f2e7cb811dd7bb2d911073b520cad66b7d604d744be9f62059ecccc76"

RPROVIDES:${PN} += "liblockfile-devel"

RDEPENDS:${PN} += "liblockfile1"

inherit rpm
