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

RPM_NAME = "python313-cmdln-2.0.0-4.5.noarch.rpm"
RPM_HASH = "b1a7ab656b2a24bb9d0a426e564234be152bd0cf44d8f8ef6e7e42fe23ef2969fc2a788b0af25fa6b3d76c917d7e9a1972575f2164a371b45e752031bc8706b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cmdln \
python3.13dist-cmdln \
python313-cmdln \
python3dist-cmdln"

RDEPENDS:${PN} += "python-abi"

inherit rpm
