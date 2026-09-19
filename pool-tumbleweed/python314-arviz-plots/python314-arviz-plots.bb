SUMMARY = "Ready to use and composable plots for Bayesian Workflow"
DESCRIPTION = "ArviZ plotting elements and static battery included plots"
LICENSE = "Apache-2.0"

PV = "1.3.0"

RPM_NAME = "python314-arviz-plots-1.3.0-1.1.noarch.rpm"
RPM_HASH = "38e6871d4cbf7b2a47628348fcfc84705e15c2b2261594b97ec858c3649148fb3bdbbc3b84ddb92fbedae7e71b330c7b1c919b39496e5bd7673b124ff64c28f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-arviz-plots \
python314-arviz-plots \
python3dist-arviz-plots"

RDEPENDS:${PN} += "python-abi \
python314-arviz-base \
python314-arviz-stats"

inherit rpm
