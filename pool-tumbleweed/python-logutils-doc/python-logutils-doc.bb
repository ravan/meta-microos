SUMMARY = "Documentation for python-logutils"
DESCRIPTION = "The logutils package provides a set of handlers for the Python standard \
library's logging package. \
 \
Some of these handlers are out-of-scope for the standard library, and \
so they are packaged here. Others are updated versions which have \
appeared in recent Python releases, but are usable with older versions \
of Python and so are packaged here. \
 \
This package contains the documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.5"

RPM_NAME = "python-logutils-doc-0.3.5-7.9.noarch.rpm"
RPM_HASH = "832c168418c556c95dc6064eaab939e29b4726aaf067ea9ba42a70a1cb790f8e746703fce9c8cdb08f0ffac37af82a6c362ab65db0ea746516236017ae1183c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-logutils-doc \
python313-logutils-doc \
python314-logutils-doc"

RDEPENDS:${PN} += ""

inherit rpm
