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

RPM_NAME = "python313-Send2Trash-2.1.0-1.3.noarch.rpm"
RPM_HASH = "0f21c712bf4562049cf82526bb66c05c68b549cd2514a57a1aed670b78e0dcb1d57e7cdc7a0b13cc2dce3c34eaf4af6852ed6fd8c93ecdf2bb999d63b3333f48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Send2Trash \
python3-send2trash \
python3.13dist-send2trash \
python313-Send2Trash \
python313-send2trash \
python3dist-send2trash"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
typelib-GObject \
typelib-Gio \
update-alternatives"

inherit rpm
