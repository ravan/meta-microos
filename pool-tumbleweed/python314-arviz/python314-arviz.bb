SUMMARY = "Exploratory analysis of Bayesian models"
DESCRIPTION = "ArviZ is a Python package for exploratory analysis of Bayesian models. Includes \
functions for posterior analysis, data storage, model checking, comparison and \
diagnostics."
LICENSE = "Apache-2.0"

PV = "1.3.0"

RPM_NAME = "python314-arviz-1.3.0-1.1.noarch.rpm"
RPM_HASH = "d12bf10023a525dc62d49f6489d56f5f4193e937e9dd453646f3bba61d9abb880179004eae2e609dff70f884cd394e030c3ae53c27c2b0d31cabdc6c573a8f6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-arviz \
python314-arviz \
python3dist-arviz"

RDEPENDS:${PN} += "python-abi \
python314-arviz-base \
python314-arviz-plots \
python314-arviz-stats"

inherit rpm
