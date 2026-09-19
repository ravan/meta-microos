SUMMARY = "Verifies code hasn't left circular references"
DESCRIPTION = "Verifies code hasn't left circular references"
LICENSE = "Artistic-2.0"

PV = "1.60.0"

RPM_NAME = "perl-Test-Memory-Cycle-1.60.0-1.7.noarch.rpm"
RPM_HASH = "3c114a78949213c08c87d0e8bd3af648f512a52b9329b9ef30b271390ed1e5eca393e0ac30c62714cbe2dfe88d2f4dd634a7762a02911c660ebb29eab1dc0a8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Memory--Cycle \
perl-Test-Memory-Cycle"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Devel--Cycle \
perl-PadWalker"

inherit rpm
