SUMMARY = "Documentation for Flask-Assets"
DESCRIPTION = "This package contains documentation for the Flask-Assets module."
LICENSE = "BSD-2-Clause"

PV = "2.1.0"

RPM_NAME = "python-Flask-Assets-doc-2.1.0-3.5.noarch.rpm"
RPM_HASH = "433f8560a359ecfed57dd92ac244ff036b7550582a6d341ccf1e5269b247c3300e9159d3930502a558c7bcb084563e86398abe52067ab25f167a5ef139afcab5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-Flask-Assets-doc \
python313-Flask-Assets-doc \
python314-Flask-Assets-doc"

RDEPENDS:${PN} += ""

inherit rpm
