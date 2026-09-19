SUMMARY = "Colored terminal output for Python's logging module"
DESCRIPTION = "The `coloredlogs` package enables colored terminal output for Python's logging_ \
module. The ColoredFormatter_ class inherits from `logging.Formatter`_ and uses \
`ANSI escape sequences`_ to render your logging messages in color. It uses only \
standard colors so it should work on any UNIX terminal. It's currently tested \
on Python 2.6, 2.7, 3.4, 3.5 and PyPy. On Windows `coloredlogs` automatically \
pulls in Colorama_ as a dependency and enables ANSI escape sequence translation \
using Colorama."
LICENSE = "MIT"

PV = "15.0.1"

RPM_NAME = "python314-coloredlogs-15.0.1-6.5.noarch.rpm"
RPM_HASH = "fd5196a0e871ba71fc301ef7efcdd81973a2d1bc8d5e16de05d86dabebddef2148addb826b54b0c1727810a110627d5756da0bd70eb5abf5cd4f3ceb9a0d6834"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-coloredlogs \
python314-coloredlogs \
python3dist-coloredlogs"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-capturer \
python314-humanfriendly"

inherit rpm
