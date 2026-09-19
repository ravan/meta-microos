SUMMARY = "Exploratory analysis of Bayesian models"
DESCRIPTION = "ArviZ is a Python package for exploratory analysis of Bayesian models. Includes \
functions for posterior analysis, data storage, model checking, comparison and \
diagnostics."
LICENSE = "Apache-2.0"

PV = "1.3.0"

RPM_NAME = "python313-arviz-1.3.0-1.1.noarch.rpm"
RPM_HASH = "6d65959ae3494e71773c7c307c0102da45bb6cc7d805b79d4572c1a59cf33efae1ef3b7a897454055a9d7192e4aa83065831fd7910aee56c8ae18271a1d946f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-arviz \
python3.13dist-arviz \
python313-arviz \
python3dist-arviz"

RDEPENDS:${PN} += "python-abi \
python313-arviz-base \
python313-arviz-plots \
python313-arviz-stats"

inherit rpm
