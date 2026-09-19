SUMMARY = "Ready to use and composable plots for Bayesian Workflow"
DESCRIPTION = "ArviZ plotting elements and static battery included plots"
LICENSE = "Apache-2.0"

PV = "1.3.0"

RPM_NAME = "python313-arviz-plots-1.3.0-1.1.noarch.rpm"
RPM_HASH = "54668bb6e2ee767d32b940525d962045a49c970bba1cc7f33d3891bd76ba5d362c19e0168661400cc8a938130cd54f81a86b75ebdd939002836e8858c52d4698"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-arviz-plots \
python3.13dist-arviz-plots \
python313-arviz-plots \
python3dist-arviz-plots"

RDEPENDS:${PN} += "python-abi \
python313-arviz-base \
python313-arviz-stats"

inherit rpm
