SUMMARY = "A Python interface to the UNIX dialog utility and mostly-compatible programs"
DESCRIPTION = "Python wrapper for the UNIX 'dialog' utility \
Easy writing of graphical interfaces for terminal-based applications"
LICENSE = "LGPL-2.1-only"

PV = "3.5.3"

RPM_NAME = "python314-pythondialog-3.5.3-2.5.noarch.rpm"
RPM_HASH = "23eac867f83cb1cf13349bfef7e778086503a2ff7a179e8b33e6398a763a12cfb4c3e29cc1f23c2aba055c764ae21241bcb9c5a9dbf65a8fca0de8281acdc875"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pythondialog \
python314-pythondialog \
python3dist-pythondialog"

RDEPENDS:${PN} += "dialog \
python-abi"

inherit rpm
