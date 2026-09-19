SUMMARY = "Python package to read and write Microsoft OLE2 files"
DESCRIPTION = "Olefile is a Python package to parse, read and write Microsoft OLE2 \
files (also called Structured Storage, Compound File Binary Format or \
Compound Document File Format), such as Microsoft Office 97-2003 \
documents, vbaProject.bin in MS Office 2007+ files, Image Composer and \
FlashPix files, Outlook messages, StickyNotes, several Microscopy file \
formats, McAfee antivirus quarantine files, etc."
LICENSE = "BSD-2-Clause & HPND"

PV = "0.47"

RPM_NAME = "python314-olefile-0.47-1.9.noarch.rpm"
RPM_HASH = "f2c513b3fd6a9df8b134eeb03ac2525ad9c2eee7e46c4239d84d6e3804d6e6b82e74f1f2400022c196b6e9aaf892b251f1b8a96eb0c0e1fb32cbb4018189eb07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-olefile \
python314-olefile \
python3dist-olefile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
