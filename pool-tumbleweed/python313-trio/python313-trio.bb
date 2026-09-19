SUMMARY = "Python async/await-native I/O library"
DESCRIPTION = "The Trio project produces an async/await-native I/O library for \
Python. Like all async libraries, its main purpose is to help write \
programs that do multiple things at the same time with parallelized \
I/O, such as a web spider that wants to fetch lots of pages in \
parallel, a web server that needs to juggle lots of downloads and \
websocket connections at the same time, a process supervisor \
monitoring multiple subprocesses. Compared to other libraries, Trio \
has an obsessive focus on usability and correctness."
LICENSE = "Apache-2.0 | MIT"

PV = "0.33.0"

RPM_NAME = "python313-trio-0.33.0-1.3.noarch.rpm"
RPM_HASH = "184f58cc318a1122e19d0104e5696b78e365fe4447af65c7031af3f441fc89f2a2a563e5e65d4badb51a07589612f3a3cb21fa73554e6afba5bd427ce83612bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-trio \
python3.13dist-trio \
python313-trio \
python3dist-trio"

RDEPENDS:${PN} += "python-abi \
python313-attrs \
python313-idna \
python313-outcome \
python313-sniffio \
python313-sortedcontainers"

inherit rpm
