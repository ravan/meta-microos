SUMMARY = "NNTP Library (including compressed headers)"
DESCRIPTION = "This package includes advanced NNTP features, including, \
compressed headers. \
 \
The most important (useful) feature of this package over other \
nntp libraries is the ability to use generators to produce \
data. This allows for streaming download of large responses to \
say an XOVER command (which can produce gigabytes of data) and \
allows you to process the data at the same time is is being \
received. Meaning that memory use is minimal (even for the \
largest responses) and that cycles aren't being wasted waiting on \
a blocking read (even in a single threaded application)"
LICENSE = "GPL-3.0-or-later"

PV = "2.0.1"

RPM_NAME = "python314-pynntp-2.0.1-2.5.noarch.rpm"
RPM_HASH = "6a2a57476cee99f27d01abe31be50ce0bc1104e9c3248ce627118c83f85153c74935cd91c10c5fbf447b9c9f506f538c919962d10c5de8951ba4a6b75583ae39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pynntp \
python314-pynntp \
python3dist-pynntp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
