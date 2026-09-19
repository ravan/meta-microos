SUMMARY = "Sphinx extension to document CLI programs"
DESCRIPTION = "This contrib extension, sphinxcontrib.autoprogram, provides an automated way to \
document CLI programs. It scans arparser.ArgumentParser object, and then expands \
it into a set of .. program:: and .. option:: directives."
LICENSE = "BSD-2-Clause"

PV = "0.1.9"

RPM_NAME = "python314-sphinxcontrib-autoprogram-0.1.9-2.5.noarch.rpm"
RPM_HASH = "0ac23a3214464eefb54d0985a6ceb8923f3714f0741caa0b1ebbb30768b8c3f47023afc688f98f4b26c5958cb6d959ca2dbc3734ba2360e06c09944de83afb27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinxcontrib-autoprogram \
python314-sphinxcontrib-autoprogram \
python3dist-sphinxcontrib-autoprogram"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx"

inherit rpm
