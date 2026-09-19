SUMMARY = "Mutable mapping tools"
DESCRIPTION = "Mutable Mapping interfaces for python."
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "python314-zict-3.0.0-4.2.noarch.rpm"
RPM_HASH = "5cb211b7f76d4967d19d71be93d6c0aa48ae25fc488948bec9ddfb09dac6d5023fe8f739d9ecf452837d9bd9749d2b86935b4dd65e17a138938d1328c421c87c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-zict \
python314-zict \
python3dist-zict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
