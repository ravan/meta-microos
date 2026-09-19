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

RPM_NAME = "python313-pynntp-2.0.1-2.5.noarch.rpm"
RPM_HASH = "261627b7df9dce1eed6028e9cf645fe03a8abcbaf09d09a1727937248f25d891ab46f198147275e8991d9d56e292fcee43e31bea2bd5b696aa93814c17ffa9bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pynntp \
python3.13dist-pynntp \
python313-pynntp \
python3dist-pynntp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
