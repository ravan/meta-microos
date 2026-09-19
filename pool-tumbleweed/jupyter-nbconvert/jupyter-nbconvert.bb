SUMMARY = "Conversion of Jupyter Notebooks"
DESCRIPTION = "The jupyter nbconvert package converts notebooks to various other formats \
via Jinja templates. \
 \
This package provides the jupyter components."
LICENSE = "BSD-3-Clause & MIT"

PV = "7.17.1"

RPM_NAME = "jupyter-nbconvert-7.17.1-2.1.noarch.rpm"
RPM_HASH = "88fbe2628fe0fab409ef06576d204c0e782466bc3efb8f207e075636daa2dc380380a2857641c8dfc5b6ac1c3808393e19baf05a39fb6c6c8d1735689009d1ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbconvert"

RDEPENDS:${PN} += "jupyter-ipykernel \
jupyter-jupyter-core \
python3dist-nbconvert"

inherit rpm
