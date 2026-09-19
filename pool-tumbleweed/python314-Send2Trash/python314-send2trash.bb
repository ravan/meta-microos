SUMMARY = "Python library to send files to the Trash location"
DESCRIPTION = "Send2Trash is a small package that sends files to the Trash (or \
Recycle Bin) natively and on all platforms. On OS X, it uses native \
FSMoveObjectToTrashSync Cocoa calls, on Windows, it uses native (and \
ugly) SHFileOperation win32 calls. On other platforms, if PyGObject \
and GIO are available, it will use this. Otherwise, it will fallback \
to its own implementation of the trash specifications from \
freedesktop.org."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python314-Send2Trash-2.1.0-1.3.noarch.rpm"
RPM_HASH = "5c43905d2d9cff82161c9e7d3cfc4d3656989ff04b043dce79a10c0a405238b305421a207bdedd8f5f5bc07cb22df88f0ced9b777a47095322ed0a3edbf73f4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-send2trash \
python314-Send2Trash \
python314-send2trash \
python3dist-send2trash"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
typelib-GObject \
typelib-Gio \
update-alternatives"

inherit rpm
