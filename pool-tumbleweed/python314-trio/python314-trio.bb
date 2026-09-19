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

RPM_NAME = "python314-trio-0.33.0-1.3.noarch.rpm"
RPM_HASH = "f511a6574a0ef21657ef6080fe84c7f23dbcc9fd2a0063c2c4dc5cbb1ea854ebd8036f99eddc628c1da74f67c197f53ea6d4eab718d79d11ba961c34b23c7b0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-trio \
python314-trio \
python3dist-trio"

RDEPENDS:${PN} += "python-abi \
python314-attrs \
python314-idna \
python314-outcome \
python314-sniffio \
python314-sortedcontainers"

inherit rpm
