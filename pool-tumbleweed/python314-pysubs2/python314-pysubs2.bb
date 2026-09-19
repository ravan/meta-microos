SUMMARY = "Python library for editing subtitle files"
DESCRIPTION = "pysubs2 is a Python library for editing subtitle files. It’s based on \
SubStation Alpha, the native format of Aegisub; it also supports SubRip (SRT), \
MicroDVD, MPL2, TMP and WebVTT formats and OpenAI Whisper captions. \
 \
There is a small CLI tool for batch conversion and retiming."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "python314-pysubs2-1.8.1-1.3.noarch.rpm"
RPM_HASH = "28d4ad75669f34fdd1769f0a802e4b67080b18983bf3b9453c01422e5cd2fd52a9abb220fd3b8d37384f3e4d6f5f9aa4c400003466c6e8162adfae33e77dbd05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pysubs2 \
python314-pysubs2 \
python3dist-pysubs2"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
