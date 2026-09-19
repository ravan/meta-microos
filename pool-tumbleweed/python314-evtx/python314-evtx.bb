SUMMARY = "Windows Event Log files parser"
DESCRIPTION = "python-evtx is a pure Python parser for recent Windows Event Log files (those \
with the file extension '.evtx'). The module provides programmatic access to the \
File and Chunk headers, record templates, and event entries. For example, you \
can use python-evtx to review the event logs of Windows 7 systems from a Mac or \
Linux workstation. The structure definitions and parsing strategies were heavily \
inspired by the work of Andreas Schuster and his Perl implementation \
'Parse-Evtx'."
LICENSE = "Apache-2.0"

PV = "0.8.0"

RPM_NAME = "python314-evtx-0.8.0-2.5.noarch.rpm"
RPM_HASH = "fd337affee8846a47941d9411667cc104415ee8189b5d35e9a0a1c73000b75254f5de80bf5aa7634c4a9e6f3e92363b78df5748603f519fa74d37d7c6ba6bc61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-evtx \
python314-evtx \
python3dist-python-evtx"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-hexdump \
python314-lxml"

inherit rpm
