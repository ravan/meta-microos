SUMMARY = "Sphinx extension to document CLI programs"
DESCRIPTION = "This contrib extension, sphinxcontrib.autoprogram, provides an automated way to \
document CLI programs. It scans arparser.ArgumentParser object, and then expands \
it into a set of .. program:: and .. option:: directives."
LICENSE = "BSD-2-Clause"

PV = "0.1.9"

RPM_NAME = "python313-sphinxcontrib-autoprogram-0.1.9-2.5.noarch.rpm"
RPM_HASH = "5c24f1a1f0300f7401862dce349db386e0a3301f84de028789a0375bf2e426b5fa30f263f702b3b8f0248191b6f43178c4ee0774a3f35e96d8e383b99faf3bc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-autoprogram \
python3.13dist-sphinxcontrib-autoprogram \
python313-sphinxcontrib-autoprogram \
python3dist-sphinxcontrib-autoprogram"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx"

inherit rpm
