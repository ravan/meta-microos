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

RPM_NAME = "python313-coloredlogs-15.0.1-6.5.noarch.rpm"
RPM_HASH = "0eaf9fa2fb053788455151b9ef23e029547868a78bb095cc3592b67e5569e6da9a3514572febb0c8f341ba0fd4c8fedfdd6eb2a5c1c2b772e2e2a6cf3a23e58a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-coloredlogs \
python3.13dist-coloredlogs \
python313-coloredlogs \
python3dist-coloredlogs"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-capturer \
python313-humanfriendly"

inherit rpm
