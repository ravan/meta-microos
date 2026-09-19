SUMMARY = "Python package to read and write Microsoft OLE2 files"
DESCRIPTION = "Olefile is a Python package to parse, read and write Microsoft OLE2 \
files (also called Structured Storage, Compound File Binary Format or \
Compound Document File Format), such as Microsoft Office 97-2003 \
documents, vbaProject.bin in MS Office 2007+ files, Image Composer and \
FlashPix files, Outlook messages, StickyNotes, several Microscopy file \
formats, McAfee antivirus quarantine files, etc."
LICENSE = "BSD-2-Clause & HPND"

PV = "0.47"

RPM_NAME = "python313-olefile-0.47-1.9.noarch.rpm"
RPM_HASH = "311b9ee4596fed5ce1a32570a8c85bf611337cfd117519b3242d4eac4d2f71f5d9756c53ba2283134bc1dd10a0dcbb62b31a80be3e8244fdd99216088145f30c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-olefile \
python3.13dist-olefile \
python313-olefile \
python3dist-olefile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
