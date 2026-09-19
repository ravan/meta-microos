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

RPM_NAME = "python313-evtx-0.8.0-2.5.noarch.rpm"
RPM_HASH = "cdad1fe6c05289248d04bbbdcebca08a2c5fc819dcecc44de640d6192098375f94f8d10b6a9a8ea95bf4ea59223279235fbf4810dbc92718d9d3ae6adde5167a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-evtx \
python3.13dist-python-evtx \
python313-evtx \
python3dist-python-evtx"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-hexdump \
python313-lxml"

inherit rpm
