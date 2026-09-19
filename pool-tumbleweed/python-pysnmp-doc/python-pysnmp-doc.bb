SUMMARY = "PySNMP documentation"
DESCRIPTION = "PySNMP documentation and examples."
LICENSE = "BSD-2-Clause"

PV = "7.1.25"

RPM_NAME = "python-pysnmp-doc-7.1.25-1.2.noarch.rpm"
RPM_HASH = "8fbbbe5b854e01f6fd51bf7be7a8a8b7fcc038e18480418b73838e4e232354393fc1907d92d163d03fd695c060fe43e3c79e122c0e9442d981e8a0822ea4070e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pysnmp-doc \
python313-pysnmp-doc \
python314-pysnmp-doc"

RDEPENDS:${PN} += ""

inherit rpm
