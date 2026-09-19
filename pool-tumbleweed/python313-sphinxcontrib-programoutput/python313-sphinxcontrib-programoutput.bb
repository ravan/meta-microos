SUMMARY = "Sphinx extension to include program output"
DESCRIPTION = "A Sphinx extension to literally insert the output of arbitrary commands into \
documents, helping you to keep your command examples up to date."
LICENSE = "BSD-2-Clause"

PV = "0.18"

RPM_NAME = "python313-sphinxcontrib-programoutput-0.18-1.7.noarch.rpm"
RPM_HASH = "335bedac1d34a59a23b97195ad6728d58a6c6628d5f97537847911df6f264f2f52ffe9a2917f69a2133d4368347d9556dd5a4137472f681c118d2f2f53522540"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-programoutput \
python3.13dist-sphinxcontrib-programoutput \
python313-sphinxcontrib-programoutput \
python3dist-sphinxcontrib-programoutput"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx"

inherit rpm
