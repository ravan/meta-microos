SUMMARY = "Git integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides git integration."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "python310-nbdime-git-4.0.2-17.1.noarch.rpm"
RPM_HASH = "4a5c1593dd7fbe0a6afdcedb90b6541e35a5b80103625145aef87928c84894b7cfddc6ae01b17227e818a20b923b064eebc14fa84acff4b9d3f9fa92839cb9e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-jupyter-nbdime-git \
python310-nbdime-git"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
git-core \
python310-nbdime"

inherit rpm
