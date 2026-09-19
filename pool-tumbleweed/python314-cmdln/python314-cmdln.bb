SUMMARY = "An improved cmd.py for Writing Multi-command Scripts and Shells"
DESCRIPTION = "`cmdln.py` is an extension of Python's default `cmd.py` module that \
provides 'a simple framework for writing line-oriented command \
interpreters'.	The idea (with both cmd.py and cmdln.py) is to be able \
to quickly build multi-sub-command tools (think cvs or svn) and/or \
simple interactive shells (think gdb or pdb).  Cmdln's extensions make \
it more natural to write sub-commands, integrate optparse for simple \
option processing, and make having good command documentation easier."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-cmdln-2.0.0-4.5.noarch.rpm"
RPM_HASH = "36f033335240812c935802dfa91d4fcf28418a577b80e3fc9eadc2acbcac917d8fa0021f4bb50336b8e2c96cdfc9b7d2de3dc47eed094044d4a6ec4d0f2f24c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cmdln \
python314-cmdln \
python3dist-cmdln"

RDEPENDS:${PN} += "python-abi"

inherit rpm
