SUMMARY = "Python library for editing subtitle files"
DESCRIPTION = "pysubs2 is a Python library for editing subtitle files. It’s based on \
SubStation Alpha, the native format of Aegisub; it also supports SubRip (SRT), \
MicroDVD, MPL2, TMP and WebVTT formats and OpenAI Whisper captions. \
 \
There is a small CLI tool for batch conversion and retiming."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "python313-pysubs2-1.8.1-1.3.noarch.rpm"
RPM_HASH = "711b2204c36166201ecf310825aabfa3ee806dc0518df11d3888cd30e402fba2eca2c19a6fd6e0431b10084440e8f5da7017d616cc611c73ab75ce6abe3cc6f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pysubs2 \
python3.13dist-pysubs2 \
python313-pysubs2 \
python3dist-pysubs2"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
