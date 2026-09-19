SUMMARY = "Fish Completion for gnuradio"
DESCRIPTION = "Fish command line completion support for gnuradio."
LICENSE = "GPL-3.0-or-later"

PV = "3.10.12.0"

RPM_NAME = "gnuradio-fish-completion-3.10.12.0-4.1.noarch.rpm"
RPM_HASH = "883a01788b39b66db879f8975e2ca467d7a6229d7dcaf0063da2e3aff0b6a71a705435536e9ff8f67e11d0e836d1e37aaad90ed8ac3b8f85e966e779ff141aab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuradio-fish-completion"

RDEPENDS:${PN} += "gnuradio"

inherit rpm
