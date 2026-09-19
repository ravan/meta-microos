SUMMARY = "Sphinx extension for masking unsupported directives and roles"
DESCRIPTION = "Sphinx extension for masking unsupported directives and roles."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "python313-sphinxnotes-mock-1.1-1.4.noarch.rpm"
RPM_HASH = "d19c99a13b15bd1cbf413021e778acd58cd35a038efcd8fc2895d869738318a5b562cca8a417993cd4c47cfa3fce09c6a363c4886a6a4bf221619f90d8e09d6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxnotes-mock \
python3.13dist-sphinxnotes-mock \
python313-sphinxnotes-mock \
python3dist-sphinxnotes-mock"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx"

inherit rpm
