SUMMARY = "Intelligent Archive Extraction Tool"
DESCRIPTION = "dtrx stands for 'Do The Right Extraction'. It is a tool for Unix-like \
systems for extracting different archive formats. \
 \
Features: \
* Support for many archive types, including tar, zip, cpio, deb, rpm, \
  gem, 7z, cab, gz, bz2, and lzma files. Extra compression like \
  .tar.bz2 is recognized. \
* Archives are extracted into their own dedicated directories. \
* All extracted files can be read and written, while leaving the rest \
  of the permissions intact. \
* dtrx can find archives inside the archive and extract those too."
LICENSE = "GPL-3.0-only"

PV = "8.7.1"

RPM_NAME = "dtrx-8.7.1-1.1.noarch.rpm"
RPM_HASH = "3cdbb858e2c292336d9483ddeac19668aebb4f671b9fb69fc00a268d13bd3783dc8be0e44ffdcb6bb0a502d647201a98540d2868a25174dc611f476c044901f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dtrx \
python3.13dist-dtrx \
python3dist-dtrx"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
bzip2 \
cpio \
gzip \
python-abi \
tar \
unzip"

inherit rpm
