SUMMARY = "Python to JavaScript compiler"
DESCRIPTION = "PScript is a Python to JavaScript compiler, and is also the name of the subset \
of Python that this compiler supports."
LICENSE = "BSD-2-Clause"

PV = "0.8.1"

RPM_NAME = "python313-pscript-0.8.1-1.2.noarch.rpm"
RPM_HASH = "5e0bc5a652a0b206c3f0ff187b963ec326d5120dd8716faf964f6339af721fbbb1683445ea1883c90f328e440d7adefcd2a6ba8503868e990efb47615b5896ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pscript \
python3.13dist-pscript \
python313-pscript \
python3dist-pscript"

RDEPENDS:${PN} += "python-abi"

inherit rpm
